public boolean onItemLongClick(android.widget.AdapterView parent, android.view.View view, int position, long id) {
    latLongList.remove(position);
    latLongList.clear();
    mAdapter.notifyDataSetChanged();
    saveData();
    return true;
}