void loop() {
    while (!(isInterrupted())) {
        try {
            handleOrWait();
        } catch (java.lang.InterruptedException e) {
            break;
        }
    } 
}