@java.lang.Override
public void onFailure(@android.support.annotation.NonNull
java.lang.Exception exception) {
    android.util.Log.w(com.concavenp.artistrymuse.services.UploadService.TAG, "uploadFromUri:onFailure", exception);
    broadcastUploadFinished(null, fileUri);
    taskCompleted();
}