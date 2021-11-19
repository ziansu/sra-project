@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (singletonCheckBox.isSelected()) {
        requireGetInstanceCheckBox.setEnabled(true);
    }else {
        requireGetInstanceCheckBox.setEnabled(false);
    }
}