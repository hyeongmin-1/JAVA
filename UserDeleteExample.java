import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDeleteExample {
    public static void main(String[] args) {
        Connection con = null;
        try{
            Class.forName("oracle.jdbc.OracleDriver");

            con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/XE",
                "system",
                "1234"
            );
            String sql = "DELETE FROM USERS WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "winter2");

            int rows = ps.executeUpdate();
            System.out.println("삭제된 행 수: " + rows);

            ps.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(con != null){
                try{
                    con.close();
                }catch(SQLException e){}
            }
        }
    }
}
