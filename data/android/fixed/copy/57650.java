public boolean backupDatabase(android.content.Context context) {
    return dbWriter.exportDatabase(context);
}