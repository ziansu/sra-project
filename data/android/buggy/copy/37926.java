@java.lang.Override
public void onUploadCompleted() {
    android.util.Log.d(com.wolfpakapp.wolfpak2.camera.editor.PictureEditorLayout.TAG, "Upload Completed");
    com.wolfpakapp.wolfpak2.camera.editor.UndoManager.clearStates();
    startCamera();
}