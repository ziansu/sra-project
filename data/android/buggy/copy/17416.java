public T take() throws java.lang.InterruptedException {
    synchronized(this) {
        while (isEmpty()) {
            wait();
            java.lang.System.out.println("Blocking Read");
        } 
        notify();
    }
    return read();
}