import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardsManager implements BoardsInterFace{
    private static String URL = "jdbc:oracle:thin:@localhost:1521/XE";
    private static String USER = "system";
    private static String PASSWORD = "1234";
    
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }

    @Override 
    public void create(Boards boards){
        if(boards == null){
            return ;
        }
        String sql = "INSERT INTO BOARDS (BNO,BTITLE,BSAY,BUSER)  VALUES(SEQ_BOARDS_BNO.NEXTVAL,?,?,?)";
        try(Connection con = getConnection();
            PreparedStatement pst = con.prepareStatement(sql)){
                pst.setString(1,boards.getBtitle());
                pst.setString(2,boards.getBsay());
                pst.setString(3,boards.getBuser());
            int rows = pst.executeUpdate();
            if(rows>0){
                System.out.println("게시물을 등록했습니다.");
            }

        }catch(SQLException e){
            System.out.println("게시물 등록에 오류가 생겼습니다.");
            e.printStackTrace();
        }
    }
    
    @Override 
    public void read(){
        String sql = "SELECT * FROM BOARDS ORDER BY BNO ASC";
        List<Boards> board = new ArrayList<>();

        try(Connection con = getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery()){
                while (rs.next()) {
                    board.add(new Boards(
                        rs.getInt("BNO"),
                        rs.getString("BTITLE"),
                        rs.getString("BSAY"),
                        rs.getString("BUSER")
                    ));                    
                }
            }catch(SQLException e){
                System.out.println("게시물 조회에 실패하셨습니다");
                return;
            }
            if(board.isEmpty()){
                System.out.println("등록된 게시물이 없습니다");
                return;
            }
            System.out.printf("%-10s | %-18s | %-15s | %-10s%n" , "번호","제목","내용","작성자");
            System.out.println("-------------------------------------------------------------------");
            for(Boards boards : board ){
                System.out.printf("%-10s | %-20s | %-15s | %-10s%n ",
                    boards.getBno(),
                    boards.getBtitle(),
                    boards.getBsay(),
                    boards.getBuser());
        }
    }
    
    @Override 
    public void clear(){
        String sql = "DELETE FROM BOARDS";
            try(Connection con = getConnection();
                PreparedStatement pst = con.prepareStatement(sql)){
                    int rows = pst.executeUpdate();
                    if(rows>0){
                        System.out.println("전체 게시물 (" + rows + "건)을 삭제했습니다");
                    }else{
                        System.out.println("삭제 할 게시물이 없습니다");
                    }
                }catch(SQLException e){
                    System.out.println("전체 삭제 중 오류가 발생하였습니다");
                    e.printStackTrace();
                }
    }
    
    @Override 
    public void exit(){
        System.out.println("정상적으로 종료되었습니다");
        System.exit(0);
    }

    public void searchByBno(int bno){
        String sql = "SELECT BNO,BTITLE,BSAY,BUSER FROM BOARDS WHERE BNO = ?";
            try(Connection con = getConnection();
                PreparedStatement pst = con.prepareStatement(sql)){

                    pst.setInt(1,bno);

                    try(ResultSet rs = pst.executeQuery()){
                        if(rs.next()){
                            System.out.printf("%-10s | %-18s | %-15s | %-10s%n"  , "번호","제목","내용","작성자");
                            System.out.println("-----------------------------------------------------------------------");
                            System.out.printf("%-10s | %-18s | %-15s | %-10s%n",
                                    rs.getInt("BNP"),
                                    rs.getString("BTITLE"),
                                    rs.getString("BSAY"),
                                    rs.getString("BUSER"));
                        }else{
                            System.out.println("해당 게시글을 찾을 수 없습니다");
                        }
                    }
            }catch(SQLException e){
                System.out.println("DB 게시글 조회 오류");
            }
    }
    public void update(Boards boards){
        if(boards == null){
            return;
        }
        String sql = "UPDATE BOARDS SET BTITLE = ? , BSAY = ? WHERE BNO = ?";
        try(Connection con = getConnection();
            PreparedStatement pst = con.prepareStatement(sql)){
                pst.setString(1,boards.getBtitle());
                pst.setString(2,boards.getBsay());
                pst.setInt(3,boards.getBno());

                int rows = pst.executeUpdate();
                if(rows>0){
                    System.out.println(boards.getBno() + "번 게실물을 수정했습니다");
                }else{
                    System.out.println("해당 게시물이 존재하지 않습니다");
                }

            }catch(SQLException e){
                System.out.println("DB 오류로 인해 수정되지 않았습니다");
            }
    }
    public void delete(int bno){
        String sql = "DELETE FROM BOARDS WHERE BNO = ?";
        try(Connection con = getConnection();
            PreparedStatement pst = con.prepareStatement(sql)){
                pst.setInt(1,bno);
                int rows = pst.executeUpdate();
                if(rows>0){
                    System.out.println(bno+"번 게실물을 삭제했습니다");
                }else{
                    System.out.println("해당 번호의 게시물이 존재하지 않습니다");
                }
            }catch(SQLException e){
                System.out.println("게시물 삭제 중 오류가 발생하였습니다");
            }
    }
}
