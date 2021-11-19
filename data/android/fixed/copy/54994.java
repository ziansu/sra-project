private static java.io.File getAppropriateStorageDir(android.content.Context context) {
    java.io.File storageDir = com.example.nicco.inspectionReviewManager.FileIO.getExternalStorageDir(context);
    if (storageDir == null) {
        storageDir = com.example.nicco.inspectionReviewManager.FileIO.getInternalCachedStorageDir(context);
    }
    return storageDir;
}