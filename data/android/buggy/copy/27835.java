public void run() {
    try {
        check5();
        notifyAll();
        wait();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}