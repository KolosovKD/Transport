package ru.avalon.Transport.transport;

public class Truck extends AbstractTransport implements Ground {

    private int wheelsNumber;

    public Truck(int tank, int consumption, int wheelsNumber) {
        super(tank, consumption);
        this.wheelsNumber = wheelsNumber;
    }

    @Override
    public int getWheelsNumber() {
        return wheelsNumber;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "tank=" + tank +
                ", consumption=" + consumption +
                ", wheelsNumber=" + wheelsNumber +
                '}';
    }
}
