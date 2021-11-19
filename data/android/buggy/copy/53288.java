public void close() {
    running = false;
    sc.close();
    ct.close();
    ct.interrupt();
}