import java.io.IOException;

public class KeyboardToString {
    public static void main(String[] args) throws IOException{
        byte[] bytes = new byte[100];

        System.out.print("입력: ");
        int readByteno = System.in.read(bytes);
        

        /*readByteno-2 를 해주는 이유는 byte[100]값에
        엔터도 널값으로 치환되어 들어가므로 엔터가 들어갈
        공간을 확보해주는것*/
        
        String str = new String(bytes,0,readByteno-2);
        System.out.println(str);
    }
}

