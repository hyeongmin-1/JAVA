public class MemberExample3 {
    public static void main(String[] args) {      
    
    Member3 or = new Member3("홍길동", 25, new int[]{90,90}, new Car10("소나타"));

    Member3 cloned = or.getMember3();
    cloned.scores[0] = 100;
    cloned.car.model = "그랜저";

    System.out.println("복제 객체의 필드값");
    System.out.println("name: " + cloned.name);
    System.out.println("age:" + cloned.age);    
    System.out.print("scores:{");
    for(int i = 0; i<cloned.scores.length;i++){
        System.out.print(cloned.scores[i]);
        System.out.print((i==(cloned.scores.length-1))?"":",");
    }
    System.out.println("}");
    System.out.println("car: " + cloned.car.model);

    System.out.println();
    
    System.out.println("원본 객체의 필드값");
    System.out.println("name: " + or.name);
    System.out.println("age:" + or.age);    
    System.out.print("scores:{");
    for(int i = 0; i<or.scores.length;i++){
        System.out.print(or.scores[i]);
        System.out.print((i==(or.scores.length-1))?"":",");
    }
    System.out.println("}");
    System.out.println("car: " + or.car.model);


    
    }
    
}
