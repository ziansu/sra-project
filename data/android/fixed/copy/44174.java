@java.lang.Override
public void selected(com.nullpointergames.boardgames.chess.PieceType pieceType) {
    java.lang.StringBuilder move = new java.lang.StringBuilder().append('p').append(pieceType.name());
    session.send(move.toString());
}