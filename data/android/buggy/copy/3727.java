public void cancelAdding(android.view.View v) {
    changeToModeNormal();
    java.util.Arrays.fill(selectedViews, java.lang.Boolean.FALSE);
    resetViews();
}