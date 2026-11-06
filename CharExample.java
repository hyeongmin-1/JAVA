public class CharExample {
    public static void main(String[]args){
        //''=문자형 더이상 쪼개 질 수 없는 값 (스택에 저장)
        //""=클래스형 객체 그대로 저장(힙에 저장)
        char c1 = 'A';    //문자를 직접 저장 
        char c2 = 65;     //십진수로 저장
        char c3 = '\u0041'; //16진수로 저장

        char c4 = '가';   //문자를 직접 저장
        char c5 = 44032;  //십진수로 저장
        char c6 = '\uac00'; //16진수로 저장

        int uniCode = c1;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(uniCode);
    }
    
}
