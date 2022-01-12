public boolean accept(java.io.File dir, java.lang.String filename) {
    java.io.File sel = new java.io.File(dir, filename);
    return filename.endsWith(it.angelic.soulissclient.preferences.DbPreferenceListener.DB_BACKUP_FORMAT);
}