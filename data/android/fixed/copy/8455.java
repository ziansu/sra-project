public boolean isArc(int v1, int v2) {
    return toBoolean(mGraph.get(((v1 * (mSize)) + v2)));
}