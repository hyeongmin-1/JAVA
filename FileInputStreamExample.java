import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\Java.HM\\hyeongmin\\src\\FileInputStreamExample.java");
            int data;
            //아스킷코드를 문자로 변환
            while ((data = fis.read()) != -1) {
                System.out.write(data);
                System.out.println(data);                
            }
            fis.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
