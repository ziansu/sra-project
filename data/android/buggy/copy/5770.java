public void decimal(android.view.View v) {
    if (lastPress.equals("=")) {
        clearAll();
        lastPress = "";
    }
    Display.append(".");
    btnDot.setEnabled(false);
}