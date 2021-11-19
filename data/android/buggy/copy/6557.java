public void setintakeLifter(double angle) {
    intakeLifter.set(angle);
    pidController.setSetpoint(angle);
    java.lang.System.out.println(potentiometer.get());
}