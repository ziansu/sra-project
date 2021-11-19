private void doWait() {
    do {
        try {
            latch.await();
        } catch (java.lang.InterruptedException e) {
        }
    } while ((latch.getCount()) != 0 );
}