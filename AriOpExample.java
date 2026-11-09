public class AriOpExample {
    public static void main(String[]args){
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2;
        System.out.println("result1: " + result1);
        //모든 피연산자 int 타입으로 변환 후 연산

        long result2 = v1 + v2 - v4;
        System.out.println("result2: " + result2);
        //모든 피연산자 long 타입으로 변환 후 연산

        double result3 = (double)v1 % v2;
        System.out.println("result3: " + result3);
        //double 으로 강제 변환 후 연산

        int result4 = v1 % v2;
        System.out.println("result4: " + result4);
    }
    
}
