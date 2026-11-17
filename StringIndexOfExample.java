public class StringIndexOfExample {
    public static void main(String[] args) {
        String sb = "자바 프로그래밍";

        int location = sb.indexOf("프로그래밍");
        System.out.println(location);

        if(sb.indexOf("자바") != -1){
            System.out.println("자바와 관련된 책이군요");
        }else{
            System.out.println("자바와 관련없는 책이군요");
        }
    }
}
