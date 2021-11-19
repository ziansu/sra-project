@java.lang.Override
public void run() {
    while (a) {
        move();
        try {
            java.lang.Thread.sleep(MOVETIME);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}