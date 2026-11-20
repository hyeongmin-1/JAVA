import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.FileInputStream;

public class UpdateExample {
    public static void main(String[] args) {
        Connection con = null;
        try{
            Class.forName("oracle.jdbc.OracleDriver");

            con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/XE",
                "system",
                "1234"
            );                       
            
            String sql = new StringBuilder()
                    .append("UPDATE BOARDS SET ")
                    .append("BTITLE=?, ")
                    .append("BCONTENT=?, ")
                    .append("BFILENAME=?, ")
                    .append("BFILEDATA=? ")
                    .append("WHERE BNO=? ")
                    .toString();
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,"눈사람");
            pst.setString(2,"눈으로 만든 사람");
            pst.setString(3,"snowman.jpg");
            pst.setBlob(4, new FileInputStream("C:/JAVA.HM/Wolf.jpg"));
            pst.setInt(5,2);

            int rows = pst.executeUpdate();
            System.out.println("수정된 행의 수: " + rows);
            pst.close();
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
