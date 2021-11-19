private void onSwipingEnd() {
    if (swipeMode) {
        viewBackup = null;
        swipeMode = false;
        if ((onEnd) != null) {
            onEnd.onChange();
        }
    }
}