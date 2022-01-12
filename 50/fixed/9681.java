public int getNodeInDegree(int nodeIndex) {
    int degree = nodeBuf.getInt(((uk.ac.kent.dover.fastGraph.FastGraph.NODE_IN_DEGREE_OFFSET) + (nodeIndex * (uk.ac.kent.dover.fastGraph.FastGraph.NODE_BYTE_SIZE))));
    return degree;
}