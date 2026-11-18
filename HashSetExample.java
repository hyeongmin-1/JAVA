import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        //set은 주머니형태로 무순서 정보 저장
        //다만 정보를 뱉을 때는 순서있이
        //
        Set<String> set = new HashSet<String>();

        set.add("java");
        set.add("JDBC");
        set.add("Servlet/Jsp");
        set.add("Java");
        set.add("iBATIS");

        int size = set.size();
        System.out.println("총 객체 수: " + size);
        
        //hasNext,next는 Iterator에서 제공한것
        //Set에서 제공한게 아님
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("iBATIS");

        System.out.println("총 객체 수: " + set.size());

        for(String elemet : set){
            System.out.println("\t" + elemet);
        }

        set.clear();
        if(set.isEmpty()){System.out.println("비었음");}
    }
}
