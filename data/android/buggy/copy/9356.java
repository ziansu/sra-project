@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    superOnBackPressed();
    if (!(newFileName.isEmpty())) {
        deletePicRef(newPicRef);
    }
}