@java.lang.Override
public void onPhotoStoreReady(int requestId, byte[] data) {
    mStorageController.storePicture(data);
    com.fezrestia.android.viewfinderanywhere.control.OverlayViewFinderController.getInstance().getCurrentState().onPhotoStoreReady(data);
}