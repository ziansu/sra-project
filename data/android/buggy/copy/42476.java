public boolean getRawButton(int buttonIndex) {
    if ((buttonIndex >= 0) && (buttonIndex < (axes.length))) {
        return buttons[buttonIndex];
    }
    return false;
}