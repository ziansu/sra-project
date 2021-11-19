@java.lang.Override
public java.util.List<T> findAll(java.lang.String selects) {
    return db().find(getEntityType()).select(selects).findList();
}