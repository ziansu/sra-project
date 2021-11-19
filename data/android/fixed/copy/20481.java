public void actionPerformed(java.awt.event.ActionEvent event) {
    if ((clientIdChosen) != null) {
        clientController.selectClient(clientIdChosen, panel, scroll);
    }
}