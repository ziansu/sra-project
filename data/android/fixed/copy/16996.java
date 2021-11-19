@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    android.net.Uri downloadUrl = taskSnapshot.getDownloadUrl();
    if (activity != null) {
        activity.onImageUploaded(crumbPicture);
    }
}