public void addFilterItem(int position, com.yeahdev.yeahurls.model.NoteItem model) {
    this.noteItemCollection.add(position, model);
    notifyItemInserted(position);
}