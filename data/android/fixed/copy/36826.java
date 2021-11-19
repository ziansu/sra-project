@java.lang.Override
public void detachFromPlayer() {
    if ((player) != null) {
        player.canMove(true);
    }
    onDestroyFixtures();
    super.detachFromPlayer();
}