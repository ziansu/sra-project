public void tableChanged(javax.swing.event.TableModelEvent e) {
    if (!(slash.navigation.gui.helpers.JTableHelper.isFirstToLastRow(e)))
        return ;
    
    if (getPositionsModel().isContinousRange())
        return ;
    
    handlePositionsUpdate();
}