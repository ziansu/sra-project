void onPause() {
    isThatOk = false;
    try {
        myThread.join();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    myThread = null;
}