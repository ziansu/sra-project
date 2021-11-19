@java.lang.Override
public java.lang.Integer addVertex() {
    adjacencyList.add(new java.util.TreeSet<java.lang.Integer>());
    return (adjacencyList.size()) - 1;
}