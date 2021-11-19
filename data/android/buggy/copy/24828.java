public void addName(java.lang.String name) {
    content.add(name);
    notifyDataSetChanged();
    setNoContent(true);
}