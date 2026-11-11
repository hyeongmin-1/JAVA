public class Car6 {
    int speed;

    int getSpeed(){
        return speed;
    }
    
    void keyTurnON(){
        System.out.println("키를 돌립니다");
    }

    void run(){
        for(int i=10; i<=300; i+=15){
            speed = i;
            System.out.println("달립니다.(시속:" + speed + "km/h)");
        }
    }
    
}
