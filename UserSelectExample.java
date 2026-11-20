import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExample {
    public static void main(String[] args) {
        Connection con = null;
        try{
            Class.forName("oracle.jdbc.OracleDriver");

            con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/XE",
                "system",
                "1234"
            );
            String sql = "" +
                "SELECT USERID,USERNAME,USERPASSWORD,USERAGE,USEREMAIL" +
                "FROM USERS " +
                "WHERE USERID=?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,"winter2");

            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                User user = new User();
                user.setUserId(rs.getString("userid"));
                user.setUserName(rs.getString("username"));
                user.setUserPassword(rs.getString("userpassword"));
                user.setUserage(rs.getInt(4));
                user.setUserEmail(rs.getString(5));
                System.out.println(user);
            }else{
                System.out.println("사용자 아이디가 존재하지 않음");
            }
            rs.close();
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
