public void setPath(java.lang.String path) {
    sharedPrefEditor.putString("PATH", path);
    listFragment.refresh();
}