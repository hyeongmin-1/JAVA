import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book_Manger implements Manage_able{

    List<BookRe> bo = new ArrayList<>();
    private final String fp = "C:/Temp/books.txt";   
   
    @Override 
    public void addItem(BookRe bookRe){
        if(bookRe != null){
        bo.add(bookRe);
        }
    }
    @Override     
    public void displayAll(){
        if(bo.isEmpty()){
            System.out.println("등록된 도서가 없습니다");
            return;
        }

        System.out.printf("%-6s | %-18s | %-15s%n","ID","제목","저자");
        System.out.println("-------------------------------------------------");
        for(BookRe bookRe : bo){
            System.out.printf("%-6s | %-20s | %-15s%n",
                bookRe.getId(),
                bookRe.getTitle(),
                bookRe.getAuthor());
        }
    }
    @Override 
    public void saveToFile(){
        File fo = new File("C:/Temp");
        if(!fo.exists()){
            fo.mkdir();
        }
        try(FileWriter fw = new FileWriter(fp)){             
        
        for(BookRe bookRe : bo){
           fw.write(bookRe.toFileString() + System.lineSeparator());
        }       
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("파일저장 중 오류가 발생했습니다");
        }
    }    
   @Override 
   public void loadFromFile(){
    File f1 = new File(fp);
    if(!f1.exists()){
        return ;
    }
    bo.clear();
    try(Scanner filscanner = new Scanner(f1);){
        
        while (filscanner.hasNext()) {
            String line = filscanner.nextLine();
            if(line.isEmpty()){
                continue;
            }
            
            String[]data = line.split(",");
            if(data.length == 3){
                int id = Integer.parseInt(data[0]);
                BookRe bookRe = new BookRe(id,data[1],data[2]);
                bo.add(bookRe);
            }
        }
    }catch(Exception e){
        e.printStackTrace();
    }
   }  
    
    
}

