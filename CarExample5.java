public class CarExample5 {
    public static void main(String[] args) {
        Car5 mayCar = new Car5();
        
        mayCar.setGas(10);

        boolean gasState = mayCar.isLeftGas();
        
        if(gasState){
            System.out.println("출발합니다.");
            mayCar.run();
        }
        
        if(mayCar.isLeftGas()){
            System.out.println("gas주입이 필요없습니다.");
        }
        else{
            System.out.println("gas를 주입하세요");
        }
        
    }
}
