public boolean toggleFullscreen() {
    try {
        fullscreen = !(fullscreen);
        Gdx.graphics.setDisplayMode(originalWidth, originalHeight, fullscreen);
        return true;
    } catch (java.lang.Throwable notTooBad) {
    }
    return false;
}