@java.lang.Override
protected java.util.Map<java.lang.String, java.util.Map> doInBackground(java.lang.Integer... params) {
    return databaseManager.getUCSBCommonsDataFromHTML(currentDate);
}