public long countVertices() {
    makeActive();
    return getRawGraph().countClass(OrientVertexType.CLASS_NAME);
}