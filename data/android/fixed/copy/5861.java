@java.lang.Override
public void render() {
    if (!(paused)) {
        worldController.update();
    }
}