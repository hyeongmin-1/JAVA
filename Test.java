import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception{
              
        Scanner scanner = new Scanner(System.in);      
        BookManager bookManager = new BookManager();        
        boolean run = true;  

        bookManager.loadtFromFile();

        while(run){
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
                    System.out.println("저자: ");
                    String author = scanner.nextLine();

                    Book book = new Book(id, title, author);
                    bookManager.addItem(book);
                    System.out.println("결과: 성공적으로 등록되었습니다");
                }catch(Exception e){
                    System.out.println("가득 찼습니다");
                }
                System.out.println("=========================");                
                break;
            
            case "2":
                boolean searchRun = true;
                while (searchRun) {                  
                    System.out.println("[도서 목록 조회]");
                    System.out.println("1. 전체조회");
                    System.out.println("2. ID 개별 조회");
                    System.out.println("조회 방식 선택 >> ");
                    String subChoice = scanner.nextLine();

                    if(subChoice.equals("1")){
                        bookManager.displayAll();
                        searchRun = false;
                    }else if(subChoice.equals("2")){
                        try{
                            System.out.println("검색할 ID: ");
                            int searchID = Integer.parseInt(scanner.nextLine());
                            bookManager.searchById(searchID);
                            searchRun = false;
                        }catch(Exception e){
                            System.out.println("오류: ID는 숫자로 입력해주세요");
                        }
                    }else{
                        System.out.println("잘못된 입력입니다.");
                    }
                }
                System.out.println("================================");
                break;
            
            case "3":
                bookManager.saveToFile();
                run = false;
                System.out.println("정상적으로 종료되었습니다");        
                break;
            
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }          
        }
        scanner.close();
    }
}

