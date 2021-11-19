public void actionPerformed(java.awt.event.ActionEvent event) {
    if ((clientIdChosen) != null) {
        int id = java.lang.Integer.parseInt(clientIdChosen);
        clientController.deleteClient(id, panel, scroll);
    }
}