import java.util.Scanner;
public class Test1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int i = 0;
        int sum = 0;

        while (run) {
            System.out.println("---------------------------------------------");
            System.out.println("1.랜덤 | 2.증가 | 3.감소 | 4.유니코드 | 5.종료");
            System.out.println("---------------------------------------------");
            System.out.print("선택 : ");
            String strNum = scanner.nextLine();
           
            int num = (int)(Math.random()*1000) + 1;

            if(strNum.equals("1")){
                sum = num + sum;
                System.out.println("랜덤숫자 : " + sum);            
        }else if(strNum.equals("2")){
            i++;
            System.out.println("증가: " + i);
        }else if(strNum.equals("3")){
            i--;
            System.out.println("감소: " + i);
        }else if(strNum.equals("4")){
             char copy= (char)num;
            System.out.println("이번 유니코드는 : " + copy + " " +" 숫자값: " + num);
        }
        else{
            run = false;
        }
        }
        
    }
}
