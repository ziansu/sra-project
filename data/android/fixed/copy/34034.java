@java.lang.Override
public void delete() {
    super.delete();
    tile.settlers.remove(this);
    utils.game.countdownTasks.remove(cityBuilder);
}