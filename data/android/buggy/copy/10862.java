public void actionPerformed(java.awt.event.ActionEvent event) {
    int id = java.lang.Integer.parseInt(clientIdChosen);
    clientController.deleteClient(id, panel, scroll);
}