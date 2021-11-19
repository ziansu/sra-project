private void onSwipingStart() {
    viewBackup = null;
    swipeMode = true;
    if ((onStart) != null) {
        onStart.onChange();
    }
}