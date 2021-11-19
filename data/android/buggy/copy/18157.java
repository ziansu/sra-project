public org.elasql.cache.CachedRecord readFromSink(org.elasql.sql.RecordKey key, int mySinkId, org.vanilladb.core.storage.tx.Transaction tx) {
    return org.elasql.cache.tpart.TPartCacheMgr.localStorage.read(key, mySinkId, tx);
}