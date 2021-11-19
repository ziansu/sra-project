public void freeAll() throws java.lang.InterruptedException {
    synchronized(this) {
        memory = null;
        allocateNext = 0;
    }
}