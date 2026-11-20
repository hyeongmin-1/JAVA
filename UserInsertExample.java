import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {
    public static void main(String[] args) {
        Connection con = null;
        try{
        Class.forName("oracle.jdbc.OracleDriver");
        con = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521/XE",
            "system",
            "1234"
        );
        //매개변수화 된 Sql 문 작성
        String sql = "" + 
        "INSERT INTO USERS(USERID, USERNAME, USERPASSWORD,USERAGE,USEREMAIL)" + 
        "VALUES(?,?,?,?,?)";

        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, "winter2");
        pst.setString(2,"한겨울");
        pst.setString(3, "12345");
        pst.setInt(4,25);
        pst.setString(5, "winter@mycompany.com");

        //sql 실행
        int rows = pst.executeUpdate();
        System.out.println("저장된 행 수: " + rows);      
        
        //PreparedStatement 닫기
        pst.close();

    }catch(ClassNotFoundException e){
        e.printStackTrace();

    }catch(SQLException e){
        e.printStackTrace();
    }
    }
}
