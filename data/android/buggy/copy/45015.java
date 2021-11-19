public void addAll(java.util.List<com.liangmayong.base.widget.recycler.RecyclerListView.Item<?>> items, boolean notify) {
    this.items.addAll(items);
    if (notify) {
        notifyDataSetChanged();
    }
}