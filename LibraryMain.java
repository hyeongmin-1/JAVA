import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book_Manger bookManageRE = new Book_Manger();         
        boolean run = true;

        bookManageRE.loadFromFile();

        while (run) {
            System.out.println("============ LIBRAY SYSTEM =============");
            System.out.println(" 1. 도서 등록");
            System.out.println(" 2. 도서 목록 조회");
            System.out.println(" 3. 저장 및 종료");
            System.out.println("메뉴 선택 >>  ");
            String inputString = scanner.nextLine();

            switch (inputString) {
                case "1":
                    System.out.println("[도서 등록]");

                    try{
                        System.out.println("ID: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.println("제목: ");
                        String title = scanner.nextLine();
                        System.out.println("저자");
                        String author = scanner.nextLine();

                        BookRe bookRe = new BookRe(id,title,author);
                        bookManageRE.addItem(bookRe);
                        System.out.println("결과 : 성공적으로 등록되었습니다");    
                    }catch(Exception e){
                        System.out.println("더 이상 추가 할 수 없습니다");
                    }

                    System.out.println("==================================");
                    break;
                
                case "2":                                  
                    System.out.println("[도서 목록 조회]");
                    bookManageRE.displayAll();                 
                    System.out.println("--------------------------------------------");
                    break;
                
                case "3":
                    bookManageRE.saveToFile();
                    run = false;
                    System.out.println("정상적으로 종료되었습니다");        
                    break;
                
                default:
                    System.out.println("잘못된 입력입니다");
                    break;
            }
        }
    }
}
