public void setRank(com.cjmalloy.stratego.Rank r) {
    rank = r;
    flags &= ~(com.cjmalloy.stratego.Piece.IS_SUSPECTED);
    flags &= ~(com.cjmalloy.stratego.Piece.MAYBE_EIGHT);
    flags &= ~(com.cjmalloy.stratego.Piece.IS_LESS);
}