public static long indexEntryResourceId(long labelId, org.neo4j.kernel.api.schema.IndexQuery... predicates) {
    if (!(org.neo4j.kernel.impl.locking.ResourceTypes.useStrongHashing)) {
        return org.neo4j.kernel.impl.locking.ResourceTypes.indexEntryResourceId_2_2_0(labelId, predicates, 0);
    }else {
        return org.neo4j.kernel.impl.locking.ResourceTypes.indexEntryResourceId_4_x(labelId, predicates);
    }
}