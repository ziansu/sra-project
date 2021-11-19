public void await(int version) throws java.lang.InterruptedException {
    while (version == (versionNumber.get())) {
        wait();
    } 
}