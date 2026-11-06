public class StringConcatExample {
    public static void main(String[]args){
        //숫자연산
        int result1= 10 + 2+ 8;
        System.out.println("result1: " + result1);

        //결합연산
        String result2 = 10 + 2 +"8";
        System.out.println("result2: " + result2);
        //10+2을 하고 문자열인 8은 그대로 오니까 128로 나옴

        String result3 = 10 + "2" + 8;
        System.out.println("result3: " + result3);
        //숫자 + 문자 + 숫자니까 10"2"8로 연산되어서 1028로 나옴

        String result4 = "10" + 2 + 8;
        System.out.println("result4: " + result4);
        //문자 + 숫자 + 숫자니까 "10"28 연산 1028

        String result5 = "10" + (2 + 8);
        System.out.println("result5: " +result5);
        //()먼저 계산 문자 + 숫자니까 "10"10

    }
    
}
