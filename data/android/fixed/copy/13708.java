protected static boolean isMarbleOnBoard(exit104.maurersmarbles.Marble marble) {
    com.google.common.base.Preconditions.checkNotNull(marble, "Null marble");
    return (marble.getBoardIndex()) < (Board.BOARD_INDEX_START_MIN.get(marble.getPlayerNumber()));
}