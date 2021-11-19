@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        outline.fileInput(states[stateTextField.getSelectedIndex()]);
        operationStarted();
    } catch (java.io.FileNotFoundException e1) {
        e1.printStackTrace();
    }
}