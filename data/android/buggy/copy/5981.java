public org.strongback.components.Switch atZeroPoint() {
    return () -> feeder.isFwdLimitSwitchClosed();
}