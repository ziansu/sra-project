public void run() {
    if (current != null) {
        com.codename1.ui.Component focused = current.getFocused();
        if (focused != null) {
            focused.requestFocus();
        }
        current.revalidate();
    }
}