private void removeFromRecent(org.apache.zeppelin.notebook.socket.Message message) throws java.io.IOException {
    usersRepo().removeNoteFromRecent(message.principal, ((java.lang.String) (message.get("noteId"))));
    sendRecentNotes(message.principal);
}