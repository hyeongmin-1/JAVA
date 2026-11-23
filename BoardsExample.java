import java.util.Scanner;
public class BoardsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BoardsManager boardsManager = new BoardsManager();

        boolean run = true;
        while (run) {
            System.out.println("==============BOARDS============");
            System.out.println("1. Create ");
            System.out.println("2. Read");
            System.out.println("3. Clear");
            System.out.println("4. Exit");
            System.out.println("메뉴 선택 >> ");
            String inpuString = scanner.nextLine();

            switch (inpuString) {
                case "1": 
                    System.out.println("[Create]");
                    System.out.println("제목");
                    String btitle = scanner.nextLine();
                    System.out.println("내용");
                    String bsay = scanner.nextLine();
                    System.out.println("작성자");
                    String buser = scanner.nextLine();
                    
                    Boards boards = new Boards(0,btitle,bsay,buser);
                    boardsManager.create(boards);

                    break;
                case "2":
                    boolean subchoice = true;
                    while (subchoice) {
                        System.out.println("\n[READ - 전체 게시물 목록]");
                        boardsManager.read();
                        System.out.println("----------------------------");
                        System.out.println("1.UPDATE | 2. DELETE | 3. 메인메뉴");
                        System.out.println("선택 >> ");
                        String sub = scanner.nextLine();

                        switch (sub) {
                            case "1":  
                                System.out.println("[UPDATE]");
                                System.out.println("수정 할 게시물 번호: ");
                                int updateBno = Integer.parseInt(scanner.nextLine());
                                System.out.println("새 제목");
                                String newTitle = scanner.nextLine();
                                System.out.println("새 내용");
                                String newSay = scanner.nextLine();

                                Boards updateBoard = new Boards();
                                updateBoard.setBno(updateBno);
                                updateBoard.setBtitle(newTitle);
                                updateBoard.setBsay(newSay);
                                boardsManager.update(updateBoard);                                
                                break;
                            case "2":
                                System.out.println("[DELETE]");
                                System.out.println("삭제 할 게시물 번호");
                                int deleteBno = Integer.parseInt(scanner.nextLine());
                                boardsManager.delete(deleteBno);
                                break;
                            case "3":
                                subchoice = false;
                                break;
                        
                            default:
                                System.out.println("잘못된 입력입니다");
                                break;
                        }
                    }                    
                    break;
                case "3": 
                    System.out.println("[CLEAR]");
                    System.out.println("전체 게시물을 정말 삭제하시겠습니까? (Y/N): " );
                    String com = scanner.nextLine();
                    if(com.equalsIgnoreCase("y")){
                        boardsManager.clear();
                    }else{
                        System.out.println("전체 삭제를 취소했습니다");
                    }                   
                    break;
                case "4": 
                    boardsManager.exit();
                    run = false;                   
                    break;
            
                default:
                    System.out.println("잘못된 입력입니다");
                    break;
            }
            
        }scanner.close();

    }
}
