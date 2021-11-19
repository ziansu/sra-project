public pieces.Piece getAt(java.lang.String coordinate) {
    int rankIdx = getRankIdx(coordinate);
    int fileIdx = getFileIdx(coordinate);
    java.util.ArrayList<pieces.Piece> rank = ranks.get(rankIdx);
    return rank.get(fileIdx);
}