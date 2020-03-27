package ru.avalon.Transport.transport;

public abstract class AbstractTransport implements Transport {

    protected int tank;
    protected int consumption;

    AbstractTransport(int tank, int consumption) {
        this.tank = tank;
        this.consumption = consumption;
    }

    @Override
    public int getMaxPath() {
        return tank / consumption;
    }

}
