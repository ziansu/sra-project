private void refreshGoals() {
    goalArrayList.clear();
    java.lang.Boolean completed = true;
    int allCategories = -1;
    goalArrayList.addAll(storage.getGoals(completed, allCategories));
    adapter.notifyDataSetChanged();
}