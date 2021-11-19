public boolean updatePiecePriority(Piece piece) {
    queue.remove(piece);
    return queue.add(piece);
}