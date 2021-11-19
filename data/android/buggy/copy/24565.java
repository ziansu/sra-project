@java.lang.Override
public void onDeleteSyncedFolderPreference(com.owncloud.android.ui.dialog.parcel.SyncedFolderParcelable syncedFolder) {
    mSyncedFolderProvider.deleteSyncedFolder(syncedFolder.getId());
    mAdapter.removeItem(syncedFolder.getSection());
    mAdapter.notifyDataSetChanged();
}