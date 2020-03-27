package ru.avalon.Transport.transport;

public class Car extends AbstractTransport implements Ground {

    private int wheelsNumber;

    public Car(int tank, int consumption, int wheelsNumber) {
        super(tank, consumption);
        this.wheelsNumber = wheelsNumber;
    }

    @Override
    public int getWheelsNumber() {
        return wheelsNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "tank=" + tank +
                ", consumption=" + consumption +
                ", wheelsNumber=" + wheelsNumber +
                '}';
    }
}
