@java.lang.Override
protected void initialize() {
    motor.reset();
    motor.enableMC();
    motor.setPosition(position);
}