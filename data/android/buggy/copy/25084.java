public void doTraversal(java.lang.String start) {
    mark = new java.util.HashMap<java.lang.String, java.lang.Boolean>(vertices.size());
    dfTraverse(start, mark);
}