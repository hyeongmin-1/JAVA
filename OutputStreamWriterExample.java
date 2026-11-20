import java.io.FileOutputStream;
import java.io.Writer;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
public class OutputStreamWriterExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/Temp/file5.txt");
        Writer writer = new OutputStreamWriter(fos);

        String data = "나의 꿈과 희망";
        String data1 = "\r\n사랑,희망,꿈,행복";
        writer.write(data);
        writer.write(data1);
        
        writer.flush();
        writer.close();
        System.out.println("파일 저장이 끝났습니다");
    }
}
