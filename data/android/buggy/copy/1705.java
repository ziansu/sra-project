public void restart() {
    this.shutdown();
    this.init();
    this.start();
}