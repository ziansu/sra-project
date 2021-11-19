@java.lang.Override
public void executeMovesFromBeginning() {
    for (com.tdt4240.RawHeroes.event.move.Move move : moves) {
        move.execute(initialBoard);
    }
}