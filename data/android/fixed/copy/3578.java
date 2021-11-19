public void focusLost(java.awt.event.FocusEvent e) {
    java.lang.System.out.println(e);
    sketch.focused = false;
    sketch.focusLost();
}