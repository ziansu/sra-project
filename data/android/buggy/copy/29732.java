public void open() {
    iothread = new java.lang.Thread(this);
    finished = false;
    iothread.start();
}