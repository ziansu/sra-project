public void addItem(roy.myclear.database.Category category) {
    mCategories.add(0, category);
    notifyDataSetChanged();
    OnFocusRequested(0, "");
}