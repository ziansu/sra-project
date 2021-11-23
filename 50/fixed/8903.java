@java.lang.Override
public boolean queryFromCache() {
    return db.queryAuthors(handleFilter, visitor);
}