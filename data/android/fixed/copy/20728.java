@java.lang.Override
public void stand() {
    player.setHeight(Player.NORMAL_HEIGHT);
    endless.state.StateNormal nor = new endless.state.StateNormal(player);
    player.setState(nor);
}