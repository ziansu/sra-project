@java.lang.Override
public void stop() {
    if ((player) != null) {
        player.stop();
    }
    prepared = false;
    done = true;
}