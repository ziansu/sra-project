public void handleGpioPinDigitalStateChangeEvent(com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent event) {
    synchronized(stateChanged) {
        state[0] = event.getState();
        stateChanged.set(true);
    }
}