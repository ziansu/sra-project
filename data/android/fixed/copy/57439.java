@java.lang.Override
protected void cleanup() {
    if ((_nextStart) < (java.lang.System.currentTimeMillis())) {
        _nextStart += _downloadEvery;
        updateDatabase();
    }
}