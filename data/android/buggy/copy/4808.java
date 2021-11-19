public void unbind(jme3utilities.ui.Hotkey hotkey) {
    assert initialized;
    java.lang.String hotkeyName = hotkey.name();
    assert hotkeyBindings.containsKey(hotkeyName) : hotkeyName;
    hotkeyBindings.remove(hotkeyName);
}