@java.lang.Override
public org.neo4j.graphdb.Lock acquireWriteLock(org.neo4j.graphdb.PropertyContainer p) {
    return locker.exclusiveLock(() -> statement, p);
}