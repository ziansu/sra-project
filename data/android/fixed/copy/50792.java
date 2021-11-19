@java.lang.Override
public boolean onClose() {
    if ((searchQuery) != null) {
        changeDir(current.path);
    }
    searchQuery = null;
    preference.LastSearchQuery.remove();
    updateMenu();
    return false;
}