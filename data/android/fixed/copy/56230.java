public void saveAction() throws java.sql.SQLException {
    for (ftTodoList.Note n : notes) {
        if ((n.getId()) == (editid))
            ftTodoList.DatabaseManager.insertNote(n);
        
    }
    editid = Note.INV_ID;
    updateNotes();
}