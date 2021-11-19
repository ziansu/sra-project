@java.lang.Override
public void detachFromPlayer() {
    if ((player) != null) {
        player.canMove(true);
    }
    super.onDestroyFixtures();
    super.detachFromPlayer();
}