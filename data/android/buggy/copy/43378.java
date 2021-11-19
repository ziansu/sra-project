@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.drive.DriveFolder.DriveFileResult result) {
    if (!(result.getStatus().isSuccess())) {
        showMessage("Error while trying to create the file");
        return ;
    }
    showMessage("Backup Success!");
    finish();
}