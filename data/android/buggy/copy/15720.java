@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    @java.lang.SuppressWarnings(value = "VisibleForTests")
    android.net.Uri downloadUrl = taskSnapshot.getDownloadUrl();
    profile.setPhotoURI(downloadUrl.getPath());
    writeUser(profile);
}