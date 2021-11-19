public void addNodeToResourceTypesIndex(final java.lang.String value, final org.neo4j.graphdb.Node node) {
    addNodeToIndex(GraphStatics.URI, value, node, tempResourceTypes, resourceTypes);
    addNodeToResourcesIndex(value, node);
}