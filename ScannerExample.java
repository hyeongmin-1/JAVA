import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력> ");
        String inpuString = scanner.nextLine();
        System.out.println(inpuString);
        System.out.println();

        System.out.print("정수 입력> ");
        int intputInt = scanner.nextInt();
        System.out.println(intputInt);
        System.out.println();

        System.out.print("실수 입력> ");
        double intputDouble = scanner.nextDouble();
        System.out.println(intputDouble);

        System.out.println("바이트 입력> ");
        byte intputByte = scanner.nextByte();
        System.out.println(intputByte);
    }
}
