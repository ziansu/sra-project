@java.lang.Override
public void delete(ID id) {
    db().find(getEntityType()).where().idEq(id).delete();
}