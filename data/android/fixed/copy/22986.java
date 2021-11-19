@java.lang.Override
public void inActive() {
    synchronized(this) {
        this.active = false;
    }
}