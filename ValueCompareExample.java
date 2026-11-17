public class ValueCompareExample {
    public static void main(String[] args) {
        /*32bit 형식으로 리턴해주는데
        이게 2의 32승 -1이다
        따라서 overflow가 나면 주소가 초과되면 맞는지 안맞는지 판단도 불가하기에
        false */
        System.out.println("[-128~127]초과값일 경우");
        Integer obj = 300;
        Integer obj2 = 300;
        System.out.println("== 결과: " + (obj == obj2));
        System.out.println("언박싱후 == 결과: " + (obj.intValue() == obj2.intValue()));
        System.out.println("equals()결과: " + obj.equals(obj2));
        System.out.println();

        System.out.println("[-128~127] 범위값 일 경우");
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("== 결과: " + (obj3 == obj4));
        System.out.println("언박싱 후 == 결과:  "+(obj3.intValue() == obj4.intValue()));
        System.out.println("equals() 결과: " + obj3.equals(obj4));
    }
}
