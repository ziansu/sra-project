private void setKeyPressed(int keyCode, boolean pressed) {
    if (keyCode < (keyPressed.length)) {
        keyPressed[keyCode] = pressed;
    }
}