public MazeCell getRandomNeighbor() {
    java.util.ArrayList<MazeCell> neighbors = getNeighbors();
    int num = generator.nextInt(neighbors.size());
    MazeCell mc = neighbors.get(num);
    return mc;
}