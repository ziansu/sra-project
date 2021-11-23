@java.lang.Override
public boolean isPressed(int keyCode) {
    return keyCode < (keyPressed.length) ? keyPressed[keyCode] : false;
}