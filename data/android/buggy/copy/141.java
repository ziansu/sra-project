protected android.view.ActionMode.Callback getWindowCallback() {
    if ((com.mesmotronic.plugins.FullScreenPlugin._windowCallback) == null) {
        com.mesmotronic.plugins.FullScreenPlugin._windowCallback = window.getCallback();
    }
    return com.mesmotronic.plugins.FullScreenPlugin._windowCallback;
}