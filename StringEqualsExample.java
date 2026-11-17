public class StringEqualsExample {
    public static void main(String[] args) {
        String var1 = new String("신민철");
        String var2 = "신민철";
        String[]var3 = {"신민철"};        

        if(var1 == var2){
            System.out.println("같은 String 객체 참조");
        }else{
            System.out.println("다른 String 객체 참조");
        }
        /*아예 객체가 다르기 때문에 thin 비교가 불가능함
        if(var1 == var3){
            System.out.println("같은 String 객체 참조");
        }else{
            System.out.println("다른 String 객체 참조");
        }*/
        if(var1.equals(var2)){
            System.out.println("같은 문자열 가짐");
        }else{
            System.out.println("다른 문자열을 가짐");
        }
        if(var1.equals(var3)){
            System.out.println("같은 문자열 가짐");
        }else{
            System.out.println("다른 문자열을 가짐");
        }
        
        
    }
}
