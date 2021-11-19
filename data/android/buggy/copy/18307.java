@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    player.stop();
    return super.onUnbind(intent);
}