import java.util.*;
import java.sql.*;


public class BookManagerSql implements Manageable {    
    private static String URL = "jdbc:oracle:thin:@localhost:1521/XE";
    private static String USER = "system";
    private static String PASSWORD = "1234";
    
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
   
    @Override 
    public void addItem(Book book){
        if(book == null){
            return ;
        }
        String sql = "INSERT INTO books(id, title, author) VALUES(?,?,?)";
    
    try(Connection con = getConnection();
        PreparedStatement pst = con.prepareStatement(sql)){
            pst.setInt(1, book.getId());
            pst.setString(2,book.getTitle());
            pst.setString(3,book.getAuthor());

            int rows = pst.executeUpdate();
            if(rows>0){
                System.out.println("결과 : 성공적으로 등록되었습니다");
            }
        }catch(SQLException e){
            System.out.println("DB 등록 오류: " + e.getMessage());       
        }
    }
    @Override     
    public void displayAll(){
        String sql = "SELECT id,title,author FROM books ORDER BY id ASC";
        List<Book> bo = new ArrayList<>();

        try(Connection con = getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery()){
            
            while (rs.next()) {
                bo.add(new Book(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("author")
                ));                
            }
            }catch(SQLException e){
                System.out.println("DB 전체 조회 오류: " + e.getMessage());
                return ;
            }
        if(bo.isEmpty()){
            System.out.println("등록된 도서가 없습니다");
            return;
        }

        System.out.printf("%-6s | %-20s | %-15s%n","ID","제목","저자");
        System.out.println("-------------------------------------------------");
        for(Book book : bo){
            System.out.printf("%-6s | %-20s | %-15s%n",
                book.getId(),
                book.getTitle(),
                book.getAuthor());
        }
    }
    
    public void saveToFile(){}    
    
    public void loadtFromFile(){}
    
    public void searchById(int id){
        String sql = "SELECT id,title,author FROM books WHERE id = ?";

        try(Connection con = getConnection();
            PreparedStatement pst = con.prepareStatement(sql)){
                
                pst.setInt(1, id);
            
            try(ResultSet rs = pst.executeQuery()){
                if(rs.next()){
                System.out.printf("%-6s | %-20s | %-15s%n", "ID", "제목", "저자");
                System.out.println("------------------------------------------------------");
                System.out.printf("%-6d | %-20s | %-15s%n",
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("author"));
            
            }else{
                System.out.println("해당 ID의 도서를 찾을 수 없습니다.");
            }
            }
        }catch(SQLException e){
            System.out.println("DB 개별 조회 오류 : " + e.getMessage());
        }
    
        
    }
    
}

