@java.lang.Override
public void checkBehaviors() {
    if ((getY()) >= 540) {
        game.removeStar(this);
    }
}