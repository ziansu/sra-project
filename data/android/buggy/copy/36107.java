private void stopSensors() {
    sm.unregisterListener(accEventListener);
    sm.unregisterListener(gyroEventListener);
    ttv.stop();
}