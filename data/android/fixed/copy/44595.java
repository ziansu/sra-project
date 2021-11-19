public void actionPerformed(java.awt.event.ActionEvent event) {
    if ((text.getText()) != null) {
        clientController.searchClient(text.getText(), panel, scroll);
    }
}