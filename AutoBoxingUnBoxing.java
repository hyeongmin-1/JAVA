public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        //Auto Boxing
        Integer obj = 100;
        System.out.println("value: " + obj.intValue());

        //대입시 Auto UnBoxing
        int value = obj;
        System.out.println("value: " + value);

        //연산시 Auto UnBoxing
        int result = obj + 100;
        System.out.println("result: " + result);
    }
}
