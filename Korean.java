public class Korean {
    //필드
    String nation = "대한민국";
    String name;
    String ssn;

    //생성자
    //this 메서드로 확실하게 정의하기
    /*pubilc Korean(String n , String s){
      name = n;
      ssn = s;
    }*/

    public Korean(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }

}
