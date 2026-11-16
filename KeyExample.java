import java.util.HashMap;

public class KeyExample {
    public static void main(String[] args) {
        //Key객체로 식별키 선정 후 String 값을 저장하는 HashMap 객체 생성
        HashMap<Key,String> ha = new HashMap<Key,String>();

        //식별키 "new Key(1)"로 "홍길동" 저장
        ha.put(new Key(1), "홍길동");


        //식별키 "new Key(1)"로 "홍길동" 읽기
        String va = ha.get(new Key(1));
        System.out.println(va);
        Object obj = new Object();
        System.out.println(obj);
        System.out.println(obj.hashCode());
    }
    
}
