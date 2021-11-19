private void startRegisterEventProcessing() {
    synchronized(lock) {
        while ((getEventsCountProcessing) > 0) {
            try {
                wait();
            } catch (java.lang.InterruptedException e) {
            }
        } 
        ++(registerEventProcessing);
    }
}