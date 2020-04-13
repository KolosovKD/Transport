package ru.avalon.Transport;

import ru.avalon.Transport.transport.*;

/**
 * Комментарий описывающий назначение класса
 */
public class Application {

    public static void main(String[] args) {

        Transport[] transports = new Transport[10];

        transports[0] = new Boeing(3000, 5, 11000);
        transports[1] = new Car(45, 7, 4);
        transports[2] = new Truck(160, 12, 14);
        transports[3] = new Train(300, 15, 30);
        transports[4] = new Boeing(5700, 6, 10000);
        transports[5] = new Car(60, 7, 4);
        transports[6] = new Car(55, 9, 4);
        transports[7] = new Train(400, 15, 30);
        transports[8] = new Ship(10000, 1);
        transports[9] = new Truck(200, 13, 10);

        Transport bestTransport = findWithMaxPath(transports);

        System.out.println(bestTransport.toString());

    }

    private static Transport findWithMaxPath(Transport[] transports) {
        if(transports.length == 0) {
            return null;
        }
        Transport result = transports[0];
        for (int i = 1; i < transports.length; i++) {
            if (result.getMaxPath() < transports[i].getMaxPath()) {
                result = transports[i];
            }
        }
        return result;
    }


}
