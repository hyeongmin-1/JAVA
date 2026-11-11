public class CalculatorExample2 {
    public static void main(String[] args) {
        Calculator2 myCal = new Calculator2();
        myCal.execute();
        myCal.execute(8,7);
        myCal.execute("10", "10");
        myCal.execute("2", "2");        
        myCal.println("하이");
        myCal.println("잼뮈땅");
    }
}
