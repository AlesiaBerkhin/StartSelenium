package oop;

public class MainCar {

    public static void main(String[] args) {

        int[] ar =  {3,7,6};

        System.out.println(ar);
        System.out.println(ar[1]);

        Car c = new Car();

        System.out.println(c);

        System.out.println(c.getBrand());

        c.toDrive();



        Car c2 = new Car(1.5, 2023, 2, "Civic");
        System.out.println(c2);

        Car c3 = new Car();
        c3.setEngine(1.5);
        c3.setYear(2023);
        c3.setModel("Civic");
        c3.setPrice(10000);

        System.out.println(c3);

        Car c4 = new Car()
                .withYear(2020)
                .withEngine(2.4);

        SportCar sc1 = new SportCar();
 //       System.out.println(sc1.);

        Truck t1 = new Truck();

        Formula1 f1 = new Formula1();
        f1.sendSOS();

        Movable.anyMethod();
        f1.otherMethod();

        Car c5 = new Formula1();

        Movable m1 = new Formula1();

        t1.toDrive();
        sc1.toDrive();
        f1.toDrive();

        Car[] cars = new Car[3];
        cars[0] = t1;
        cars[1] = sc1;
        cars[2] = f1;

        for (Car car: cars){
            car.toDrive();

        }

        Movable[] arr = new Movable[2];
        arr[0] = new Formula1();
        arr[1] = new Truck();

        for(Movable mov : arr){
            mov.sendSOS();
        }





    }

}

/*

            Stack                               Heap

    oop.oop.Car c <------------- reference ------ { engine = 0.0
                                            year = 0
                                            electric = false
                                            colors = null
                                            colorCode = 0
                                            brand = HONDA
                                            model = null
                                           }
    oop.oop.Car c1 <------------- reference ------ { engine = 0.0
                                            year = 2020
                                            electric = false
                                            colors = null
                                            colorCode = 0
                                            brand = HONDA
                                            model = null
                                           }


                        Inheritance
                                   X oop.oop.Movable abstract sendSOS() X
                        oop.oop.Car                                  Boat
             |                      |                   |           |
           oop.oop.Truck                oop.oop.SportCar            FishBoat       SportBoat
             |                      |             |         |       |
          oop.oop.AutoTrain               oop.oop.Formula1      Motor      Paddle   Jet
                        length

                       send SOS signal

                    Interface oop.oop.Movable
                    sendSOS();



 */