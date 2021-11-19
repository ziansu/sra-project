public synchronized void await(int version) throws java.lang.InterruptedException {
    while (version == (versionNumber)) {
        wait();
    } 
}