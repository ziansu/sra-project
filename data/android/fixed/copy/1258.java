@java.lang.Override
public org.neo4j.collection.primitive.PrimitiveLongIterator augmentNodesGetAll(org.neo4j.collection.primitive.PrimitiveLongIterator committed) {
    return addedAndRemovedNodes().augment(committed);
}