public class Calculator2 {
    int plus(int x,int y){
        int result = x + y;
        return result;

    }

    double avg(int x, int y){
        double sum = plus(x, y);
        double result = sum / 2;
        return result;
    }
    void execute(){
        double result = avg(7,10);
        System.out.println("실행결과: " + result);
        
    }
    void execute(int x, int y){
        int result = x + y;
        System.out.println(result);
         
    }
    void execute(String x, String y){
        String result = x + y;
        System.out.println(result);
    }
    void execute(char x, char y){
        char result = x;
        System.out.println(result);
    }
    void println(String message){
        System.out.println(message);
    }
}
