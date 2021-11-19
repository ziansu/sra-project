@java.lang.Override
public boolean hasEdge(int from, int to) {
    validateEdge(from, to);
    return neighbourList.get(from).contains(to);
}