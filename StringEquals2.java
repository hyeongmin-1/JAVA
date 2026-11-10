public class StringEquals2 {
    public static void main(String[]args){
        String strVal1 = "신민철";
        String strVal2 = "신민철";

        if(strVal1 == strVal2){
            System.out.println("Val1 과 Val2는 참조가 같음");
        } else{
            System.out.println("Val1과 Val2는 참조가 다름");
        }
        if(strVal1.equals(strVal2)){
            System.out.println("1과 2는 문자열이 같음");
        }
        
        String strVal3 = new String("신민철");
        String strVal4 = new String("신민철");

        if(strVal3 == strVal4){
            System.out.println("3과 4는 참조가 같음");
        }else{
            System.out.println("3과 4는 참조가 다름");
        }
        if(strVal3.equals(strVal4)){
            System.out.println("3과 4는 문자열이 같음");
        }
    }
}
