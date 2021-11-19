@java.lang.Override
public boolean queryFromCache() {
    db.queryGroups(visitor);
    return true;
}