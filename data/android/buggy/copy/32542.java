public synchronized void setTargetValues(edu.wpi.first.wpilibj.Joystick[] joysticks) {
    for (int i = 0; i < (joysticks.length); i++) {
        targetValues[i] = joysticks[i].getY();
    }
}