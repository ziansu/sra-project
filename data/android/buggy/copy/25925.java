public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((JBEngine.index) == 501)
        JBEngine.index -= 501;
    
    jb.showText.setText(jbtext.getMessage(JBEngine.index));
}