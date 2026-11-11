public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567","춘배");
        
        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.name = "을지문덕";
        //name에는 final이 붙지 않았으므로 변경 가능
    }
}
