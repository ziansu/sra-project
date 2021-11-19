private void createMatrix(int vertices, int edges) {
    matrix = new int[vertices + 1][vertices + 1];
    for (int i = edges - 1; i >= 0; i--) {
        placeEdgeRandomly(vertices);
    }
}