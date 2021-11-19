public synchronized void actionPerformed(java.awt.event.ActionEvent actionEvent) {
    if (command.equals("paste")) {
        fileManager.setPastInterrupted(true);
    }
    if (command.equals("delete")) {
        fileManager.setDeleteInterrupted(true);
    }
    dispose();
}