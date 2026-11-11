public class Car5 {
    int gas;

    void setGas(int gas){
        this.gas = gas;
    }
    boolean isLeftGas(){
        if(gas == 0){
            System.out.println("no gas");
            return false;
        }else{
            System.out.println("Have gas");
            return true;
        }
    }
    void run(){
        while (true) {
            if(gas>0){
                System.out.println("달립니다.(gas 잔량:" + gas +")");
                gas -=1;
            }else{
                System.out.println("멈춥니다.(gas 잔량:" + gas + ")");
                return ;
            }   
            
        }
    }
}
