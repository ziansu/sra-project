@java.lang.Override
public void run() {
    try {
        this.item = this._buffer.read(true);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}