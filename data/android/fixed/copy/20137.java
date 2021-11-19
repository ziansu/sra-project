void loop() {
    try {
        while (!(isInterrupted())) {
            handleOrWait();
        } 
    } catch (java.lang.InterruptedException e) {
    }
}