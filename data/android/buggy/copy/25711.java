public void clearItems() {
    this.header = null;
    this.footer = null;
    this.items.clear();
    notifyDataSetChanged();
}