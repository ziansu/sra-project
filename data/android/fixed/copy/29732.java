public void open() {
    finished = false;
    iothread = new java.lang.Thread(this);
    iothread.start();
}