public class InterFaceExample {
    public static void main(String[] args) {
        ImplementationC im = new ImplementationC();

        InterFaceA ia = im;
        ia.methodA();
        System.out.println();

        InterFaceB ib = im;
        ib.methodB();
        System.out.println();

        InterFaceC ic = im;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
