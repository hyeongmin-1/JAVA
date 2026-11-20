import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception{
        File file = new File("C:/Temp/books.txt");
        FileWriter fw = new FileWriter(file,true);
        FileReader fr = new FileReader(file);       
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        BookManager bookManager = new BookManager();
        List<Book> bo = new ArrayList<>();
        boolean run = true;  

        bookManager.loadtFromFile();

        while(run){
        System.out.println("============ LIBRAY SYSTEM =============");
        System.out.println(" 1. 도서 등록");
        System.out.println(" 2. 도서 목록 조회");
        System.out.println(" 3. 저장 및 종료");
        System.out.println("메뉴 선택 >>  ");
        String inputString = scanner.nextLine();         
            
        switch (inputString) {
            case "1":                
                System.out.println("[도서 등록]");
                System.out.println("ID을 입력해주세요:");
                String id = scanner.nextLine();
                System.out.println("제목을 입력해주세요");
                String title = scanner.nextLine();                
                System.out.println("저자를 입력해주세요:");
                String author = scanner.nextLine();
                System.out.println();                
                try{
                System.out.println("[도서 등록]");
                System.out.println("ID: " + id);                
                System.out.println("제목: " + title);                
                System.out.println("저자: " + author);       
                bookManager.addItem(book);
                fw.write(id);
                fw.write(title);
                fw.write(author);               
                fw.flush();
                fw.close();                                                                            
                System.out.println("결과: 성공적으로 등록되었습니다");
                }catch(Exception e){
                    e.printStackTrace();
                    System.out.println("결과: 도서가 가득 찼습니다");
                }                
                System.out.println("==============================");
                break;
            case "2":                                
                System.out.println("[도서 목록 조회]");
                bookManager.displayAll();                                
            try{                
                int readCharNo;
                char[] cbuf = new char[10000];
                while ((readCharNo = fr.read(cbuf)) != -1) {
                    String data = new String(cbuf,0,readCharNo);
                    System.out.println(data);                    
                }
                fr.close();
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("등록된 도서가 없습니다");
            }              
                break;
            case "3":    
                bookManager.saveToFile();
                run = false;
                System.out.println("정상적으로 종료되었습니다.");
                break;
        }
        }

    }
}
