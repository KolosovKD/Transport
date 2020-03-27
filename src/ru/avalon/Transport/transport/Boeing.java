package ru.avalon.Transport.transport;

public class Boeing extends AbstractTransport implements Plane {

    private int maxHeight;

    public Boeing(int tank, int consumption, int maxHeight) {
        super(tank, consumption);
        this.maxHeight = maxHeight;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public String toString() {
        return "Boeing{" +
                "tank=" + tank +
                ", consumption=" + consumption +
                ", maxHeight=" + maxHeight +
                '}';
    }
}
