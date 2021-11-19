@java.lang.Override
public org.neo4j.collection.primitive.PrimitiveLongIterator augmentNodesGetAll(org.neo4j.collection.primitive.PrimitiveLongIterator committed) {
    org.neo4j.kernel.impl.util.diffsets.ReadableDiffSets<java.lang.Long> addAndRemoved = addedAndRemovedNodes();
    org.neo4j.collection.primitive.PrimitiveLongIterator augmented = addAndRemoved.augment(committed);
    return augmented;
}