public void focusGained(java.awt.event.FocusEvent e) {
    java.lang.System.out.println(e);
    sketch.focused = true;
    sketch.focusGained();
}