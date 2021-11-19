@java.lang.Override
public void setDutyCycle(double dutyCycle) {
    if (dutyCycle >= 1.0) {
        _board.softPwmManager.setDutyCycle(_pin, 1.0);
    }else {
        _board.softPwmManager.setDutyCycle(_pin, dutyCycle);
    }
}