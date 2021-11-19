void selectSubDirectory(final java.lang.String subdir) {
    changeDirectory(((path) + subdir));
    list.setSelectedIndex(0);
    list.requestFocus();
}