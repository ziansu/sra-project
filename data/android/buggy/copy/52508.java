private void onSwipingEnd() {
    viewBackup = null;
    swipeMode = false;
    if ((onEnd) != null) {
        onEnd.onChange();
    }
}