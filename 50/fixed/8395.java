private void createMatrix(int vertices, int edges) {
    matrix = new int[vertices][vertices];
    for (int i = edges - 1; i >= 0; i--) {
        placeEdgeRandomly(vertices);
    }
}