private void loadImages() {
    if ((com.best_slopes.bestslopes.ImageAdapter.baseDir) == null)
        com.best_slopes.bestslopes.ImageAdapter.baseDir = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
    
    if (trail.isNew()) {
        getDebuggingImages();
    }
}