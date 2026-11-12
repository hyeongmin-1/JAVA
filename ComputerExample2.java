public class ComputerExample2 {
    public static void main(String[] args) {
        int r = 10;
        
        Calculator4 cal = new Calculator4();
        System.out.println("원 면적: " + cal.areaCircle(r));
        System.out.println();

        Cal2 cal2 = new Cal2();
        System.out.println("원 면적: " + cal2.areaCircle(r));
    }
}
