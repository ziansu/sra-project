public void run() {
    time += interval;
    if ((time) >= (timeOut)) {
        this.cancel();
        gameLoss();
    }
}