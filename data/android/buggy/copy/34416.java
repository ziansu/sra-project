public void clean() {
    if ((_textureToDraw) != null) {
        _textureToDraw.dispose();
        _textureToDraw = null;
    }
    _frameInfos = null;
}