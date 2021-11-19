private void trimMemory() {
    fr.s13d.photobackup.Log.d(fr.s13d.photobackup.PBApplication.LOG_TAG, "trimMemory");
    fr.s13d.photobackup.PBApplication.mediaStore.close();
    fr.s13d.photobackup.PBApplication.mediaStore = null;
}