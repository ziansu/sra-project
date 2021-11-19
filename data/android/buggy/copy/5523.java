@java.lang.Override
public void onDestroyActionMode(android.view.ActionMode mode) {
    net.micode.fileexplorer.FileListItem.mFileViewInteractionHub.clearSelection();
    ((net.micode.fileexplorer.FileExplorerTabActivity) (net.micode.fileexplorer.FileListItem.mContext)).setActionMode(null);
}