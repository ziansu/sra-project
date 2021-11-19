private boolean getNumberedButton(byte button) {
    assert button != 0;
    return driverStation.getStickButton(port, button);
}