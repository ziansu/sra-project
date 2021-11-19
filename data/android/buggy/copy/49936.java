@java.lang.Override
public synchronized void close() {
    if (this.isArmed()) {
        this.stopMotors();
        this.disarm();
    }
}