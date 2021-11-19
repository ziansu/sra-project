public void handleGpioPinDigitalStateChangeEvent(com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent event) {
    state[0] = event.getState();
    stateChanged.set(true);
}