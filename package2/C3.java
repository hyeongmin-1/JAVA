package package2;

import package1.A3;

public class C3 {
    public static void main(String[] args) {
        A3 myCar = new A3();

        //속도가 음수로 책정되었기때문에
        //setSpeed에서 지정한 if(speed<0) this.speed = 0;로인해
        //속도는 0
        myCar.setSpeed(-50);

        System.out.println("현재 속도: " + myCar.getSpeed());
        
        //속도 변경
        myCar.setSpeed(60);

        //여기서 차가 멈추었기때문에 속도가 다시 0
        if(!myCar.isStop()){
            myCar.setStop(true);
        }
        System.out.println("현재 속도: " + myCar.getSpeed());
    }
}
