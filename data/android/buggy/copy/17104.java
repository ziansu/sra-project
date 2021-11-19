@java.lang.Override
protected void onStop() {
    super.onStop();
    try {
        taskThread.setStop(true);
        taskThread.join();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}