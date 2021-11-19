private void initData() {
    noteFactory.addTestNotes();
    adapter = new com.xhinliang.dnote.adpter.NoteAdapter(this, noteFactory.getNotes());
}