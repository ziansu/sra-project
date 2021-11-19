@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    if (((newsList) != null) && ((newsList.size()) > 0)) {
        saveNewsList(newsList);
    }
    return null;
}