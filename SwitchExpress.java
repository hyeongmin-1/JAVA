public class SwitchExpress {
    public static void main(String[]args){
        char grade = 'B';

        switch(grade){
            case 'A','a' -> {
                System.out.println("우수 회원");
            }
            case 'B','b' -> {
                System.out.println("일반");
            }
            default -> {
                System.out.println("손님");
            }
        }
        //중문을 한번에 쓰는건 비추함
        switch(grade){
            case'A','a' -> System.out.println("우수");
            case'B','b' -> System.out.println("일반");
            default -> System.out.println("손님");
        }
    }
}
