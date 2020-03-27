package ru.avalon.Transport.transport;

public class Ship extends AbstractTransport {
    public Ship(int tank, int consumption) {
        super(tank, consumption);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "tank=" + tank +
                ", consumption=" + consumption +
                '}';
    }
}
