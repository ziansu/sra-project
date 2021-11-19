@java.lang.Override
public int getLifeLeft() {
    io.resourcepool.hvsz.service.Game game = get();
    java.lang.Integer result = game.getConfig().getNbSafezoneLifes();
    if (result == null) {
        return -1;
    }
    return result;
}