private void changeNotes() {
    if (((selectedContact) != null) && ((notesArea.getText()) != null)) {
        saved = false;
        selectedContact.setNotes(notesArea.getText());
    }
}