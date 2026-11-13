public class CarExample9 {
    public static void main(String[] args) {
        Car9 myCar = new Car9();       

        /*
        myCar.run();
        myCar.frontLefTire = new KumhoTire1();
        myCar.frontRighTire = new KumhoTire1();
        myCar.run();
        */
        myCar.run();
        myCar.tires[0] = new KumhoTire1();
        myCar.tires[1] = new KumhoTire1();
        myCar.run();
    }
}
