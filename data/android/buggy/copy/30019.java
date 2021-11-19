public void removeControllerEventListener(javax.sound.midi.ControllerEventListener listener, int[] controllers) {
    synchronized(_controllerEventListeners) {
        _controllerEventListeners.remove(_controllerEventListeners);
    }
}