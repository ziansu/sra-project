public void disable() {
    set(0);
    pid.setSetpoint(encoder.getDistance());
    pid.disable();
}