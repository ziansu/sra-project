public void onReset() {
    _destroyPool();
    _initPool();
    if ((_q) != null) {
        _q = null;
    }
}