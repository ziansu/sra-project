@java.lang.Override
public void run() {
    while (a) {
        synchronized(this) {
            move();
        }
        try {
            java.lang.Thread.sleep(MOVETIME);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}