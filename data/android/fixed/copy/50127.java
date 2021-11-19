@java.lang.SuppressWarnings(value = "deprecation")
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    if (!((ihm.GestionTransport.tableTransport.getSelectedRow()) == (-1))) {
        ihm.GestionTransport.tblModelTransport.removeElement(ihm.GestionTransport.tableTransport.getSelectedRow());
    }
}