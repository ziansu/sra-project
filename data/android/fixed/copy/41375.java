@java.lang.Override
public boolean isKeyPressed(int keycode) {
    if ((kstate.getOrDefault(keycode, com.ymcmp.jine.environments.opengl.Keyboard.InputState.NONE)) == (com.ymcmp.jine.environments.opengl.Keyboard.InputState.PRESSED)) {
        kstate.put(keycode, com.ymcmp.jine.environments.opengl.Keyboard.InputState.NONE);
        return true;
    }
    return false;
}