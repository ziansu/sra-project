public void addNewChild(C child) {
    l("add new child");
    if (!(child.isDrafting()))
        child.setDrafting(true);
    
    adapter.setParent(child, model);
    db.upsert(child);
}