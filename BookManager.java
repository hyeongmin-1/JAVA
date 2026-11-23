import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BookManager implements Manageable {    
    List<Book> bo = new ArrayList<>();
    private final String fp = "C:/Temp/books.txt";   
   
    @Override 
    public void addItem(Book book){
        if(book != null){
        bo.add(book);
        }
    }
    @Override     
    public void displayAll(){
        if(bo.isEmpty()){
            System.out.println("등록된 도서가 없습니다");
            return;
        }

        System.out.printf("%-6s | %-20s | %-15s%n","ID","제목","저자");
        System.out.println("-------------------------------------------------");
        for(Book book : bo){
            System.out.printf("%-6s | %-20s | %-15s%n",
                book.getId(),
                book.getTitle(),
                book.getAuthor());
        }
    }
    @Override 
    public void saveToFile(){
        File fo = new File("C:/Temp");
        if(!fo.exists()){
            fo.mkdir();
        }
        try(FileWriter fw = new FileWriter(fp)){             
        
        for(Book book : bo){
           fw.write(book.toFileString() + System.lineSeparator());
        }       
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("파일저장 중 오류가 발생했습니다");
        }
    }    
   @Override 
   public void loadtFromFile(){
    File f1 = new File(fp);
    if(!f1.exists()){
        return ;
    }
    bo.clear();
    try(Scanner filscanner = new Scanner(f1);){
        
        while (filscanner.hasNext()) {
            String line = filscanner.nextLine().trim();
            if(line.isEmpty()){
                continue;
            }
            
            String[]data = line.split(",");
            if(data.length == 3){
                int id = Integer.parseInt(data[0].trim());
                Book book = new Book(id,data[1].trim(),data[2].trim());
                bo.add(book);
            }
        }
    }catch(Exception e){
        e.printStackTrace();
    }
   }
   public void searchById(int id){
        if(bo.isEmpty()){
            System.out.println("등록된 도서가 없습니다");
            return;
        }
        for (Book book : bo) {
            if (book.getId() == id) {
                System.out.printf("%-6s | %-20s | %-15s%n", "ID", "제목", "저자");
                System.out.println("------------------------------------------------------");
                System.out.printf("%-6d | %-20s | %-15s%n",
                        book.getId(),
                        book.getTitle(),
                        book.getAuthor());
                return;
            }

        
    }
    
}
}
