@java.lang.Override
public void actionPerformed(final java.awt.event.ActionEvent e) {
    if (e.getActionCommand().equals("Save")) {
        saveValues();
        return ;
    }
    dispose();
    setVisible(false);
}