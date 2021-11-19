@java.lang.Override
public boolean onClose() {
    changeDir(current.path);
    searchQuery = null;
    preference.LastSearchQuery.remove();
    updateMenu();
    return false;
}