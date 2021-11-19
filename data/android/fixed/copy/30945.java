private void removeStoneFromBoard(com.ragego.engine.Stone stone) {
    stone.setCaptivated();
    board.remove(stone.getPosition());
    for (com.ragego.engine.GameListener listener : listeners) {
        listener.stoneRemoved(stone);
    }
}