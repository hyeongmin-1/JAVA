public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl re;
        re = new Television2();
        
        re.turnOn();
        re.setVolume(10);
        re.setVolume(5);
        re.setVolume(0);
        re.setMute(true);
        re.turnOff();
        
        RemoteControl.changeBattery();
        
        re = new Audio();

        re.turnOn();
        re.setVolume(10);
        re.setMute(false);
        re.setVolume(1);
        re.setVolume(0);
        re.setMute(true);
        re.turnOff();
        
        RemoteControl.changeBattery();
    }
}
