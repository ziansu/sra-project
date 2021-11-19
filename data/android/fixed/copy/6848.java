public void refreshNotes(int pos, com.group.mydea.Nota nota) {
    note.add(nota);
    cardAdapter.notifyDataSetChanged();
}