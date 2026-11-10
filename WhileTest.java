import java.util.Scanner;
public class WhileTest {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int sum = 0;
        int avg = 0;
        int i = 1;  
            
        while (run){
            System.out.println("-----------------------");
            System.out.println("1.총점 | 2.평균 | 3.종료");
            System.out.println("-----------------------");
            System.out.print("선택: ");

            String strNum = scanner.nextLine();

            if(strNum.equals("1")){
                while(i<=100){            
                sum += i;                
                i++;
                }            

                System.out.println("총점은 : " + sum + "입니다"); 
            } else if (strNum.equals("2")){
                
                avg = sum/100;
                
                System.out.println("평균은 : " + avg + "입니다");
                                
            } else if (strNum.equals("3")){
                run = false;
            }

            

            
        }
    }
    
}
