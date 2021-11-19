public void add(int position, com.achanr.glovercolorapp.models.GCSavedSet savedSet) {
    mSavedSetList.add(position, savedSet);
    sortList();
    int newPosition = mSavedSetList.indexOf(savedSet);
    if (newPosition >= 0) {
        notifyItemInserted(newPosition);
    }
}