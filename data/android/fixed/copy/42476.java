public boolean getRawButton(int buttonIndex) {
    if ((buttonIndex >= 0) && (buttonIndex < (buttons.length))) {
        return buttons[buttonIndex];
    }
    return false;
}