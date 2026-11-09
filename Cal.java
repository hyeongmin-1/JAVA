import java.util.Scanner;

public class Cal {
    public static void main(String[]args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.print("더 하기 값 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("더 하기 값 입력2:");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int resultplus = x + y;
        System.out.println(" 결과 : " + resultplus);
        System.out.println();

        System.out.print("빼기 값 입력: ");
        String strA = scanner.nextLine();
        int a = Integer.parseInt(strA);

        System.out.print("빼기 값 입력2: ");
        String strB = scanner.nextLine();
        int b = Integer.parseInt(strB);

        int resultminus = a - b;
        System.out.println(" 결과 : " + resultminus);
        System.out.println();

        System.out.print("곱하기 값 입력: ");
        String strC = scanner.nextLine();
        int c = Integer.parseInt(strC);

        System.out.print("곱하기 값 입력2: ");
        String strD = scanner.nextLine();
        int d = Integer.parseInt(strD);

        int resultmulti = c * d;
        System.out.println(" 결과 : " + resultmulti);
        System.out.println();

        System.out.print("나누기 값 입력: ");
        String strE = scanner.nextLine();
        int e = Integer.parseInt(strE);

        System.out.print("나누기 값 입력2: ");
        String strF = scanner.nextLine();
        int f = Integer.parseInt(strF);

        int resultdivi = e % f;
        System.out.println(" 결과 : " + resultdivi);
        System.out.println();

        while(true){
            System.out.print("입력하기: ");
            String data = scanner.nextLine();
            if(data.equals("q")){
                break;
            }
            System.out.println("출력하기: " + data);
            System.out.println();
        }
        System.out.println("종료");


        
        

    }
    
}
