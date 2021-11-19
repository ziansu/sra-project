@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    saveScreen.remove(cancel);
    frame.setContentPane(playPane);
    playPane.getWriteText().requestFocus();
}