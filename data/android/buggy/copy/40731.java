public void run() {
    for (; ;) {
        uiCallback.sendEmptyMessage(0);
        try {
            java.lang.Thread.sleep(5000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
}