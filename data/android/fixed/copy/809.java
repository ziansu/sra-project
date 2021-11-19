@java.lang.Override
public void setSpeed(double speed) {
    for (int i = 0; i < (motors.size()); i++) {
        motors.get(i).set(speed);
    }
}