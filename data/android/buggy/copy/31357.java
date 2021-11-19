@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent evt) {
    if ((textAreaFrame) == null) {
        textAreaFrame = new eca.gui.frames.TextAreaFrame(this, eca.gui.ConsoleTextArea.getTextArea());
    }
    textAreaFrame.setVisible(true);
}