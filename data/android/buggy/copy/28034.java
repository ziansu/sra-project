@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    com.formakidov.rssreader.DatabaseManager manager = com.formakidov.rssreader.DatabaseManager.getInstance(getActivity());
    manager.deleteAllNews();
    manager.addAllNews(items);
    return null;
}