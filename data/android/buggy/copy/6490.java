@java.lang.Override
public org.neo4j.io.pagecache.tracing.PageFaultEvent beginPageFault() {
    return add(new org.neo4j.test.LinearHistoryPageCacheTracer.PageFaultHEvent(this));
}