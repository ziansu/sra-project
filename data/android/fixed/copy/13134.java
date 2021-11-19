@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    int answer = dialogHelper.showConfirmDialog(dialog, "Confirm Exit", "Exit Cellfie?");
    switch (answer) {
        case javax.swing.JOptionPane.YES_OPTION :
            if (workspacePanel.shouldClose()) {
                dialog.setVisible(false);
            }
    }
}