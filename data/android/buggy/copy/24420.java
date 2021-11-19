@java.lang.Override
public void onSyncFailed(int errorCode) {
    com.z299studio.pb.Application.showToast(this, R.string.sync_failed, Toast.LENGTH_SHORT);
    if (errorCode == (SyncService.CA.NO_DATA)) {
        com.z299studio.pb.SyncService.getInstance().send(mApp.getData());
    }
}