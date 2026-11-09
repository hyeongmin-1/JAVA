public class SwitchString {
    public static void main(String[]args){
        String positon = "과장";

        switch(positon){
            case "부장":
                System.out.println("700");
                break;
            case "과장":
                System.out.println("500");
                break;
            default:
                System.out.println("300");
        }
    }
}
