@java.lang.Override
public void onConfirm() {
    mUserPrefs.removeRomsFolder(finalFolder, false);
    refreshList();
}