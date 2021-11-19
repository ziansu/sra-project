public void deleteNote(com.example.krysztian.ascribe.model.Note noteToDelete) {
    int index = notes.indexOf(noteToDelete);
    notes.remove(noteToDelete);
    notifyItemRemoved(index);
}