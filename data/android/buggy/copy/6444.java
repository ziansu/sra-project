@java.lang.Override
public void onSuccess(com.google.firebase.storage.FileDownloadTask.TaskSnapshot taskSnapshot) {
    android.widget.Toast.makeText(this, "Transcript Download Complete", Toast.LENGTH_SHORT).show();
    mProgress.dismiss();
}