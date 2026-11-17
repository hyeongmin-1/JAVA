import java.util.Arrays;
public class EqualsExample {
    public static void main(String[] args) {
        int[][] or = {{1,2},{3,4}};

        System.out.println("[얕은 복제 후 비교]");
        int[][] cl1 = Arrays.copyOf(or,or.length);
        System.out.println("배열 번지 비교: " + or.equals(cl1));
        System.out.println("1차 배열 항목값: " + Arrays.equals(or, cl1));
        System.out.println("중첩 배열 항목값: " + Arrays.deepEquals(or, cl1));

        System.out.println();

        System.out.println("[깊은 복사 후 비교]");
        int[][] cl2 = Arrays.copyOf(or, or.length);
        cl2[0] = Arrays.copyOf(or[0], or[0].length);
        cl2[1] = Arrays.copyOf(or[1], or[1].length);
        System.out.println("배열 번지 비교: " + or.equals(cl2));
        System.out.println("1차배열 항목값 비교: " + Arrays.equals(or, cl2));
        System.out.println("중첩 배열 항목값: " + Arrays.deepEquals(or, cl2));

    }
}