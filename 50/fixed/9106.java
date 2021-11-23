public void cutCmd() {
    app.getCopyPaste().copyToXML(app, app.getSelectionManager().getSelectedGeos(), false);
    deleteCmd(true);
}