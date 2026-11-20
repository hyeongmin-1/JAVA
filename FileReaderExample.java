import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) throws Exception{
        //FileReader는 FileInputStream과 동일한 역할이지만
        //FileReader는 텍스트만 읽을 수 있음.
        FileReader fr = new FileReader("C:/Java.HM/hyeongmin/src/FileReaderExample.java");

        int  readCharNo;
        char [] cbuf = new char[100];
        while ((readCharNo = fr.read(cbuf)) != -1) {
            String data = new String(cbuf,0,readCharNo);
            System.out.println(data);
            
        }
        fr.close();

    }
}
