@java.lang.Override
public int getLifeLeft() {
    io.resourcepool.hvsz.service.Game game = get();
    return game.getConfig().getNbSafezoneLifes();
}