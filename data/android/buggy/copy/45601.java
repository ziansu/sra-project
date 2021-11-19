@java.lang.Override
public void evicted(long filePageId, org.neo4j.io.pagecache.Page page) {
    onEviction.onEvict(filePageId, page);
}