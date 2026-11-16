import java.util.Objects;

public class ToStringExample2 {
    public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = null;

        System.out.println(Objects.toString(str1));
        System.out.println(Objects.toString(str2));
        //null값이 있다면 생략하고 바로 다음에 입력된 값 출력
        System.out.println(Objects.toString(str2,"이름이 없습니다"));
    }
}
