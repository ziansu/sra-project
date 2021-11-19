@java.lang.Override
public void activate(int whichToActivate) {
    state = 1;
    nextState = 2;
    com.hurryup.game.network.GameClient.sendMessage(serialize());
}