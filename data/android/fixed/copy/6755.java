@java.lang.Override
protected synchronized void doSetMode(net.sf.dz3.device.model.HvacMode mode) throws java.io.IOException {
    checkEnabled();
    this.mode = mode;
    boolean state = (net.sf.dz3.device.model.HvacMode.HEATING) == mode;
    switchMode.setState((reverseMode ? !state : state));
}