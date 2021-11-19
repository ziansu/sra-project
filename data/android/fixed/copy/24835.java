@java.lang.Override
public void run() {
    synchronized(this) {
        if ((b) != null) {
            watorDisplay.setImageBitmap(b);
        }
    }
}