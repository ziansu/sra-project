@java.lang.Override
public void resize(int width, int height) {
    super.resize(width, height);
    nl.weeaboo.vn.Launcher.LOG.info("Viewport resized: ({}x{})", width, height);
    initWindow();
}