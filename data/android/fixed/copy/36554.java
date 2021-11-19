@java.lang.Override
public void stop() {
    if (prepared) {
        player.stop();
    }
    prepared = false;
    done = true;
}