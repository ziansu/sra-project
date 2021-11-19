@java.lang.Override
public synchronized void setTaken(boolean taken) {
    if (!taken) {
        this.notifyAll();
    }
    this.taken = taken;
}