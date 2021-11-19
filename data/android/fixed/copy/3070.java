@java.lang.Override
public void changedUpdate(javax.swing.event.DocumentEvent e) {
    if (!(isBeforeDrawing())) {
        autoContentsFitSize();
    }
}