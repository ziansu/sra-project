public boolean addID(com.kamontat.code.object.IDNumber id) {
    boolean isDone = db.add(id);
    if (isDone)
        com.kamontat.code.model.DatabaseAPI.idList.add(id);
    
    return isDone;
}