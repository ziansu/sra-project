@org.jetbrains.annotations.NotNull
private java.lang.Integer indexOf(@org.jetbrains.annotations.NotNull
org.graphstream.graph.Node node) {
    int i = nodes.indexOf(node);
    if (i < 0)
        throw new java.util.NoSuchElementException();
    
    return i;
}