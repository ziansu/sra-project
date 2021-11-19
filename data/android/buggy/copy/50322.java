public final void waitForVisionStart() throws java.lang.InterruptedException {
    telemetry.addData("Vision Status", ("Initializing...\r\n" + "Please wait, do not stop the OpMode."));
    while (!(this.isInitialized())) {
        synchronized(this) {
            this.wait();
        }
    } 
}