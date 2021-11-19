@java.lang.Override
public void clampBuffer() {
    if ((buffer.amount) > (getCapacity())) {
        buffer.amount = getCapacity();
    }
}