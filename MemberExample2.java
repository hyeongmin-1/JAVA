public class MemberExample2 {
    public static void main(String[] args) {
        //원본 객체 생성
        Member2 or = new Member2("blue", "홍길동", "12345", 25, true);

        //복제 객체 생성 및 패스워드 변경
        Member2 cl = or.getMember2();
        cl.password = "67890";
        cl.id = "red";
        cl.name = "AMY";

        System.out.println("[복제 객체의 필드값]");
        System.out.println("id: " + cl.id);
        System.out.println("name: " + cl.name);
        System.out.println("password: " + cl.password);
        System.out.println("age: " + cl.age);
        System.out.println("adult: " + cl.adult);

        System.out.println("-------------------------");

        System.out.println("[원복 객체의 필드값]");
        System.out.println("id: " + or.id);
        System.out.println("name: " + or.name);
        System.out.println("password: " + or.password);
        System.out.println("age: " + or.age);
        System.out.println("adult: " + or.adult);
    }
}
