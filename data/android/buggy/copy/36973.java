@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (!(isNullAllowed()))
        return ;
    
    transferFocus();
    if (!(isNull()))
        setNull(true);
    
}