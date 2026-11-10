import java.util.Scanner;

public class DoWhile {
    public static void main(String[]args){
        System.out.println("메시지를 입력하세요");
        System.out.println("프로그름을 종료할려면 q를 입력하세요");

        Scanner Scanner = new Scanner(System.in);
        String inputString;

        do {
            System.out.print(">");
            inputString = Scanner.nextLine();
            System.out.println(inputString);
        } while( ! inputString.equals("q"));
        System.out.println();
        System.out.println("프로그램 종료");
    }
}
