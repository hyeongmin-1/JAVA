public class RemoteControlExample2 {
    public static void main(String[] args) {
        RemoteControl re = new RemoteControl() {
            public void turnOn(){}
            public void turnOff(){}
            public void setVolume(int volume){}
        };
        re = new Television2();
        re.turnOn();
        re.setVolume(5);
        re.setMute(true);        
        re.turnOff();
        RemoteControl.changeBattery();
        RemoteControl.changeBattery2();
        re = new Audio();
        re.turnOn();
        re.setVolume(10);
        
        
    }
}
