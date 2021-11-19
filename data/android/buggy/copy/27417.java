@java.lang.Override
public void setPosition(entities.player.IPlayer player, int position) {
    desktop_resources.GUI.removeAllCars(player.getName());
    desktop_resources.GUI.setCar(position, player.getName());
}