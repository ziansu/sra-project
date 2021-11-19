@java.lang.Override
public void resize(int width, int height) {
    viewport.update(width, height);
    hudViewport.update(width, height);
    super.resize(width, height);
}