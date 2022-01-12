public void setintakeLifter(double angle) {
    pidController.setSetpoint(angle);
    java.lang.System.out.println(potentiometer.get());
}