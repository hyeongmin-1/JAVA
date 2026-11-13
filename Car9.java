public class Car9 {
    /*
    Tire2 frontLefTire = new HankookTire1();
    Tire2 frontRighTire = new HankookTire1();
    Tire2 backLefTire = new HankookTire1();
    Tire2 backRighTire = new HankookTire1();
    */
   Tire2[] tires = {
    new HankookTire1(),
    new HankookTire1(),
    new HankookTire1(),
    new HankookTire1()
   };
   
   /*
    void run(){
        frontLefTire.roll();
        frontRighTire.roll();
        backLefTire.roll();
        backRighTire.roll();

    }*/
   void run(){
    for(Tire2 tire : tires){
        tire.roll();
    }
   }
}