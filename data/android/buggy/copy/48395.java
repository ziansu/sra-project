public void erasePiece() {
    for (Pair p : this.getPositions()) {
        blocks[p.getY()][p.getX()].setBlock(0);
    }
    positions.clear();
}