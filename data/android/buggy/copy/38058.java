@java.lang.Override
public void run() {
    while (started) {
        try {
            java.lang.Thread.sleep(delay);
            spawnFood();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}