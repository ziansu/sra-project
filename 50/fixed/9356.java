@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    superOnBackPressed();
    if (((fileName) != null) && (!(newFileName.isEmpty()))) {
        deletePicRef(newPicRef);
    }
}