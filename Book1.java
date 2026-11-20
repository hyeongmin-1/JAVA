public class Book1<T> {
    private String name;
    private T[] bookss;

    public Book1(String name, int capacity){
        this.name = name;
        bookss = (T[])(new Object[capacity]);
    }

    public String getName(){return name;}
    public T[] getBookss(){return bookss;}
    public void add(T t){
        for(int i=0; i<bookss.length; i++){
            if(bookss[i] == null){
                bookss[i] = t;
                break;
            }
        }
    }
    
}
