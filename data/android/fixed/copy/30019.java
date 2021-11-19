public void removeControllerEventListener(javax.sound.midi.ControllerEventListener listener) {
    synchronized(_controllerEventListeners) {
        _controllerEventListeners.remove(listener);
    }
}