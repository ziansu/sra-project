@java.lang.Override
public int getTime() {
    io.resourcepool.hvsz.service.Game game = get();
    return game.getStatus().getTimeLeft();
}