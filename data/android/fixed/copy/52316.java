public void addFilterItem(int position, com.yeahdev.yeahurls.model.NoteItem model) {
    if (position > (this.noteItemCollection.size())) {
        position--;
    }
    this.noteItemCollection.add(position, model);
    notifyItemInserted(position);
}