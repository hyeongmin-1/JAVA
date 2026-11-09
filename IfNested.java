public class IfNested {
    public static void main(String[]args){
        int score = (int)(Math.random()*20)+81;
        System.out.println("점수:" + score);

        String grade;

        if(score>=90){
            if(score>95){
                grade = "A+";
            } 
            else{
                grade = "A";
            }
        }
            else if(score>=80){
                if(score>85){
                    grade = "B+";
                }
                else{
                    grade = "B";
                }
            }
            else if(score>=70){
                if(score>=75){
                    grade = "C+";
                }
                else{
                    grade = "c";
                }
            }                      
            
            else{
                if(score>=60){
                    grade = "d+";
                }
                else{
                    grade = "d";
                }
            }
            System.out.println("학점:" + grade);
            
    }
}
