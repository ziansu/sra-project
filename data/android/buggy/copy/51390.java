@java.lang.Override
public void dispose() {
    debugRenderer.dispose();
    map.dispose();
    assetManager.dispose();
    backgroundMusic.dispose();
    try {
        pressSpace.dispose();
    } catch (java.lang.Exception e) {
    }
}