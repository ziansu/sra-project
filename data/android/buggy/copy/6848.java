public void refreshNotes(int pos, com.group.mydea.Nota nota) {
    note.set(pos, nota);
    cardAdapter.notifyDataSetChanged();
}