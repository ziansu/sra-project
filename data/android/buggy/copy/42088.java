@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent arg0) {
    int n = javax.swing.JOptionPane.showConfirmDialog(mainFrame, "Would you like to quit ?", "Quit", javax.swing.JOptionPane.YES_NO_OPTION);
    if (n == 0) {
        project.Project.saveProject();
        java.lang.System.exit(0);
    }
}