@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    frame.setContentPane(playPane);
    playPane.getWriteText().requestFocus();
    saveScreen.remove(cancel);
}