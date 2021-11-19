@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    try {
        com.wolfpakapp.wolfpak2.camera.editor.MediaSaver.saveVideotoFile(videoPath, overlay, false);
        com.wolfpakapp.wolfpak2.camera.editor.MediaSaver.stall(listener, false);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}