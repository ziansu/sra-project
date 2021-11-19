private void changeNotes() {
    if (((selectedContact) == null) || ((notesArea.getText()) == null)) {
        return ;
    }
    saved = false;
    selectedContact.setNotes(notesArea.getText());
}