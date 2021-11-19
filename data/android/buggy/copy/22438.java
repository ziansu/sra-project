@java.lang.Override
public javax.swing.JComponent createComponent() {
    myPanel = new org.jetbrains.plugins.terminal.TerminalSettingsPanel();
    if ((myProjectOptionsProvider) == null)
        return new javax.swing.JPanel();
    
    return myPanel.createPanel(myOptionsProvider, myProjectOptionsProvider);
}