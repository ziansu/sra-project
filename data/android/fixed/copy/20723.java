public MazeCell getRandomNeighbor(MazeCell c) {
    java.util.ArrayList<MazeCell> neighbors = getNeighbors(c);
    int num = generator.nextInt(neighbors.size());
    MazeCell mc = neighbors.get(num);
    return mc;
}