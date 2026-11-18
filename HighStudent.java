public class HighStudent extends Student2 {
    public HighStudent(String name){
        super(name);
    }
}
class Person1 {
    private String name;

    public Person1(String name){
        this.name = name;
    }
    public String getName(){return name;}
    public String toString(){return name;}
}
class Student2 extends Person1{
    public Student2(String name){
        super(name);
    }
}
class Worker extends Person1{
    public Worker(String name){
        super(name);
    }
}
    

