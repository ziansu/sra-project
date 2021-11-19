public void addEntry(java.lang.String e) {
    listItems.add(0, e);
    adpt.notifyDataSetChanged();
}