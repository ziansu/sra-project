@java.lang.Override
public void onStart() {
    game = mirror.getGame();
    self = game.self();
    game.setLocalSpeed(1);
    bwta.BWTA.readMap();
    bwta.BWTA.analyze();
    gameInternal = new game.GameInternal(game);
}