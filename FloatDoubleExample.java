public class FloatDoubleExample {
    public static void main (String[] args){
        //실수 값 저장
        double var1 = 3.14;
        //float var 2 =3.14; 
        //컴파일에러(3.1400000 으로 저장되기 때문에 
        // 값손실로 인해 저장 안해줌)

        float var3 = 3.14F;

        double var4 = 0.1234567890123456789;
        float var5 = 0.1234567890123456789F;

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);        

    }
    
}
