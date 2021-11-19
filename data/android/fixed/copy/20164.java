public void onPageChanged(int oldTab, int newTab, com.amaze.filemanager.fragments.MainFragment fragment) {
    saveState(oldTab);
    restoreState(tabStates[newTab], fragment);
}