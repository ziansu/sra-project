@java.lang.Override
public void activate(int whichToActivate) {
    if (((state) != 1) && ((state) != 2)) {
        state = 1;
        nextState = 2;
        com.hurryup.game.network.GameClient.sendMessage(serialize());
    }
}