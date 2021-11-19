public void unbind(jme3utilities.ui.Hotkey hotkey) {
    assert initialized;
    java.lang.String hotkeyName = hotkey.name();
    if (hotkeyBindings.containsKey(hotkeyName)) {
        hotkeyBindings.remove(hotkeyName);
    }
}