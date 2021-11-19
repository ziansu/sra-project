public void resetStudents() {
    content.clear();
    content.addAll(this.dataSource.getAllNamesInList(listName));
    setNoContent();
    notifyDataSetChanged();
}