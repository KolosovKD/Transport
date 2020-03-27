package ru.avalon.Transport.transport;

public class Train extends AbstractTransport implements Ground {

    private int wheelsNumber;

    public Train(int tank, int consumption, int wheelsNumber) {
        super(tank, consumption);
        this.wheelsNumber = wheelsNumber;
    }

    @Override
    public int getWheelsNumber() {
        return wheelsNumber;
    }

    @Override
    public String toString() {
        return "Train{" +
                "tank=" + tank +
                ", consumption=" + consumption +
                ", wheelsNumber=" + wheelsNumber +
                '}';
    }
}
