public class Forsum {
    public static void main(String[]args){
        int sum = 0;
        int i = 0;
        for(i=1; i<=100; i++){
            sum += i;
        }
        System.out.println("1~" + (i-1) + " 합: " + sum);

        int sum1 = 0;
        int ii = 0;
        for(ii = 2; ii<=200; ii++){
            sum1 += ii;
        }
        System.out.println(sum1);
    }
    /*
      int sum = 0;
        
        for(i=1; i<=100; i++){
            sum += i;
        }
        System.out.println("1~" + (i-1) + "합: " + sum);
     */
    //int i 변수를 for문 밖에서 지정하지 못하면  
    // ""문자열 안에 i가 지정될수없음
}
