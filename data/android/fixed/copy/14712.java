@java.lang.Override
protected java.util.Map<java.lang.String, java.util.Map> doInBackground(java.lang.Integer... params) {
    java.util.Map<java.lang.String, java.util.Map> result = databaseManager.getUCSBCommonsDataFromHTML(currentDate);
    return result;
}