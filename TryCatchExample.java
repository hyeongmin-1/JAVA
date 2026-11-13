public class TryCatchExample {
    public static void main(String[]args) {
        String[] aaa = {"A","B","C"};
        add(aaa);
        
        try{
            Class clazz = Class.forName("java.lang.String2");               
        }catch(ClassNotFoundException e){
            System.out.println("클래스가 존재하지 않습니다");
        }
            
       
    }  
           
    public static void add(String[]aaa){ 
        String data1;
        String data2;
    try{
        data1 = aaa[3];
        data2 = aaa[4];
        
    }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("실행 매개값의 수가 부족합니다");
            System.out.println("[실행방법]");
            return;
    }
    try{
        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2);
        int result = value1 + value2;
        System.out.println(data1 + "+" + data2 + "=" + result);
    }catch(NumberFormatException e){
        System.out.println("숫자로 변환 할 수 없습니다");
    }finally{
        System.out.println("다시 실행하세요");
    }
    }
    
    
}
