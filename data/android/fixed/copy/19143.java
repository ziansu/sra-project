public void setRank(com.cjmalloy.stratego.Rank r) {
    rank = r;
    flags &= ~((com.cjmalloy.stratego.Piece.IS_SUSPECTED) | (com.cjmalloy.stratego.Piece.MAYBE_EIGHT));
}