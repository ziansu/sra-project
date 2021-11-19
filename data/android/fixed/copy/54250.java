public void addNewChild(C child) {
    l("add new child");
    adapter.setParent(child, model);
    db.upsert(child);
}