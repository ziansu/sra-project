@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    hideDialog();
    dialogsPanel.reconstruct(Action.ELEMENT_SHRINKS, null);
    hideNotify();
}