@java.lang.Override
public void onDownloadCompleted() {
    android.util.Log.d(com.wolfpakapp.wolfpak2.camera.editor.PictureEditorLayout.TAG, "Download Completed");
    if (!(com.wolfpakapp.wolfpak2.camera.editor.PictureEditorLayout.isImage)) {
        mVideoView.start();
    }
}