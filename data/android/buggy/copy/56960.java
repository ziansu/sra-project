@java.lang.Override
public T findOne(ID id, java.lang.String selects) {
    return db().find(getEntityType()).select(selects).where().idEq(id).findUnique();
}