import java.util.*;
import java.io.*;


public class BookManager implements Manageable {    
    File temp = new File("C:/Temp/books.txt");   
    File[] contents = temp.listFiles();
    List<Book> bo = new ArrayList<>();
    
    
    Book[] books ={
        new Book(),
        new Book(),
        new Book(),
        new Book()
    };
    @Override 
    public void addItem(Book book){}
    /*@Override 
    public void displayAll(){
        if(bo.isEmpty()){
            System.out.println("등록된 도서가 없습니다");
        }
        for(int i=0; i<bo.size();i++){
            Book book = bo.get(i);
            System.out.println("ID: ");
        }
        
    }*/
    public void displayAll(){}
    @Override 
    public void saveToFile(){
        for(Book book : books){
            book.toFileString();
        }
    }
    @Override 
    public void loadtFromFile(){
        try{
            FileInputStream fis = new FileInputStream("C:/Temp/books.txt");
            Book b1 = new Book();
            int data;
            while ((data = fis.read()) != -1) {
                System.out.println(b1.getId() + b1.getTitle() + b1.getAuthor());                
            }
            fis.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
