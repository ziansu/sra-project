public static boolean isDoublePress(javafx.scene.input.KeyEvent event, long KeyEventTime) {
    if ((KeyEventTime - (util.KeyPress.timeKeyDown)) < (util.KeyPress.doublePressSpeed)) {
        return true;
    }else {
        util.KeyPress.timeKeyDown = KeyEventTime;
    }
    util.KeyPress.lastKeyPressedCode = event.getCode();
    return false;
}