public org.pentaho.di.core.database.DatabaseMeta getMetaFor(java.lang.String dbName) {
    if ((names2metas) == null) {
        throw org.pentaho.di.ui.spoon.DatabasesCollector.exception();
    }
    return names2metas.get(dbName.toLowerCase());
}