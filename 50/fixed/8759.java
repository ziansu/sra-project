@java.lang.Override
public boolean isTouched() {
    for (int pointer = 0; pointer < (com.badlogic.gdx.backends.iosmoe.IOSInput.MAX_TOUCHES); pointer++) {
        if ((touchDown[pointer]) != null) {
            return true;
        }
    }
    return false;
}