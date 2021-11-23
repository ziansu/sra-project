@java.lang.Override
public void run() {
    try {
        while (true) {
            java.lang.Thread.sleep(1000);
            this.getState().tick();
        } 
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}