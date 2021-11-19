@java.lang.Override
public java.util.Set<org.gammf.collabora_android.notes.Note> getAllNoteNotInModules() {
    final java.util.Set<org.gammf.collabora_android.notes.Note> allNotes = new java.util.HashSet<>();
    allNotes.addAll(super.getAllNotes());
    return allNotes;
}