@java.lang.Override
public java.lang.Integer addVertex() {
    adjacencyList.add(new java.util.HashSet<>());
    return (adjacencyList.size()) - 1;
}