private void toggleAbsolute() {
    toggleMode = (toggleMode) + 1;
    if ((toggleMode) >= (modeInput)) {
        toggleMode = 0;
    }else
        if ((toggleMode) < 0) {
            toggleMode = modeInput;
        }
    
}