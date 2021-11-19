public void saveAllChanges() {
    l("save all changes");
    if (model.isDrafting())
        model.setDrafting(false);
    
    setChildrenNotDrafting();
    db.update(model);
    deleteUnattachedChildren();
}