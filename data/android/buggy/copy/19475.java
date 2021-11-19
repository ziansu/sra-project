public synchronized void removeAll(java.util.List<T> items) {
    this.data.remove(items);
    com.flyn.smartandroid.ui.interfaces.ListBaseAdapter.notifyDataSetChanged();
}