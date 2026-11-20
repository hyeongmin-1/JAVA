import java.util.*;
import java.io.*;
public class Book{
    private int id;
    private String title;
    private String author;   

    public Book(){}

    public void Book(int id , String title , String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }    
    public void setId(){
        this.id = id;
    }
   public void setTitle(){
        this.title = title;
   }
   public void setAuthor(){
        this.author = author;
   }
   public String toFileString(){
    return id + "," + title + "," + author; 
   }
    
   
    



    
}
