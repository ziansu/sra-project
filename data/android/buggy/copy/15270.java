@java.lang.Override
public void run() {
    while (true) {
        fallView();
        try {
            java.lang.Thread.sleep(500);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}