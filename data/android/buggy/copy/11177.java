public static com.drewhannay.chesscrafter.models.PieceType getKnightPieceType() {
    java.util.Set<com.drewhannay.chesscrafter.models.TwoHopMovement> twoHopMovements = com.google.common.collect.Sets.newHashSet(com.drewhannay.chesscrafter.models.TwoHopMovement.with(2, 1));
    return new com.drewhannay.chesscrafter.models.PieceType("Night", null, null, twoHopMovements);
}