@java.lang.Override
protected void loaded() {
    super.loaded();
    if ((swipe) != null) {
        swipe.setEnabled(true);
        swipe.setRefreshing(false);
    }
}