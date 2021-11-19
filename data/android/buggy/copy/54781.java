@java.lang.Override
public boolean deleteSurroundingText(int leftLength, int rightLength) {
    NativeInterface.activity.onKeyDown(KeyEvent.KEYCODE_DEL, this.delKeyDownEvent);
    NativeInterface.activity.onKeyUp(KeyEvent.KEYCODE_DEL, this.delKeyUpEvent);
    return super.deleteSurroundingText(leftLength, rightLength);
}