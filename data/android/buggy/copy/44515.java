@java.lang.Override
protected void onStop() {
    if ((_shootMP) != null) {
        _shootMP.release();
        _shootMP = null;
    }
    super.onStop();
}