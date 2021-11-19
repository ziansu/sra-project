@java.lang.Override
public void init() {
    player = new Entitiy.Player(tileMap);
    player.setVector(0, 0);
    player.setPosition(100, 0);
    player.setMapPosition();
}