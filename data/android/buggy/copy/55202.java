@java.lang.Override
public void focusLost(java.awt.event.FocusEvent e) {
    if (e.getSource().equals(field)) {
        field.setText("Put Name Here");
    }
}