public void updateData(android.util.SparseArray<com.quickblox.content.model.QBFile> qbFileSparseArray) {
    this.qbFileSparseArray = qbFileSparseArray;
    notifyDataSetChanged();
}