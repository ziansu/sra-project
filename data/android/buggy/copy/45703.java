@java.lang.Override
public void resize(int width, int height) {
    viewport.update(width, height);
    camera.position.set(((camera.viewportWidth) / 2), ((camera.viewportHeight) / 2), 0);
}