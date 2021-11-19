public void wait(int t) throws java.lang.InterruptedException {
    long initialTime = java.lang.System.nanoTime();
    while (((((java.lang.System.nanoTime()) - initialTime) / 1000) / 1000) < t) {
        idle();
    } 
}