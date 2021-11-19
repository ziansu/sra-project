public boolean keyUp(int code) {
    com.nilunder.bdx.inputs.Keyboard.Log k = keyboard.codeToLog.get(code);
    k.up = (Keyboard.t) + 1;
    return true;
}