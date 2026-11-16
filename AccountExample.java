public class AccountExample {
    public static void main(String[] args) {
        Account ac = new Account();
        //예금
        ac.deposit(10000);
        //출금하기
        System.out.println("예금액: " + ac.getBalance());
        try{
            ac.withdraw(30000);
        }catch(BalanceInsufficientException e){
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
            e.printStackTrace();
        }
    }
}
