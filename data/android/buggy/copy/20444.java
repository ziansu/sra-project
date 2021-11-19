public void stopThis() {
    isStopped = true;
    this.interrupt();
}