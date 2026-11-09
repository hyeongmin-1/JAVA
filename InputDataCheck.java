public class InputDataCheck {
    public static void main(String[]agrs){
        String userInput = "NaN";
        double val = Double.valueOf(userInput);

        double currentBalance = 10000.0;

        currentBalance += val;
        System.out.println(currentBalance);
    }
}
