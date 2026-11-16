import java.util.Arrays;
public class Member3 implements Cloneable {
    
        public String name;
        public int age;
        public int[]scores;
        public Car10 car;

        public Member3(String name,int age, int[] scores,Car10 car){
            this.name = name;
            this.age = age;
            this.scores = scores;
            this.car = car;
        }
        @Override 
        protected Object clone() throws CloneNotSupportedException{
            //thin clone으로 name,age 복제
            Member3 cloned = (Member3)super.clone();
            //scores 복제
            cloned.scores = Arrays.copyOf(this.scores,this.scores.length);
            //car 복제
            cloned.car = new Car10(this.car.model);
            //deep clone된 Member 객체를 리턴
            return cloned;
        }

        public Member3 getMember3(){
            Member3 cloned = null;
            try{
                cloned = (Member3)clone();
            }catch(CloneNotSupportedException e){
                e.printStackTrace();
            }return cloned;
        }
}   

