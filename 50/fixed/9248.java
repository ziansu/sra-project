public boolean toggleFullscreen() {
    try {
        if (Gdx.graphics.setDisplayMode(originalWidth, originalHeight, (!(fullscreen)))) {
            fullscreen = !(fullscreen);
            return true;
        }
    } catch (java.lang.Throwable notTooBad) {
    }
    return false;
}