@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (ProbieGUI.doMore) {
        synchronized(ProbieIDE.holder) {
            next();
        }
    }
}