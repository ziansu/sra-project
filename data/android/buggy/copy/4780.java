@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    new java.lang.Thread(new Heart.UpdateCheckerThread(false)).start();
}