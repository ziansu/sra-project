@java.lang.Override
public T current() {
    return buffer.getSlot(clock.nanoTime());
}