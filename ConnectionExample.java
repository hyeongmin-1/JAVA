
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {
    public static void main(String[] args) {
        Connection con = null;
        try{
            //JDBC Driver 등록
            Class.forName("oracle.jdbc.OracleDriver");

            //연결하기
            con = DriverManager.getConnection(
            //순서대로 url , user(id) , password
                "jdbc:oracle:thin:@//localhost:1521/XE",
                "system",
                "1234"
            );
            System.out.println("연결성공");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(con != null){
                try{
                    //연결끊기
                    con.close();
                    System.out.println("연결끊기");
                }catch(SQLException e){}
            }
        }
    }
}
