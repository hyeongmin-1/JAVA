public class SmartTelevisionExample {
    public static void main(String[] args) {
        RemoteControl rc = new Television2(); 
          
        rc = new Television2();
        rc.turnOn();
        rc.setVolume(10);
        rc.setMute(true);
        rc.turnOff();

        rc = new SmartTelevision();
        rc.turnOn();
        rc.setVolume(5);        
        rc.turnOff();
        
    }
}
