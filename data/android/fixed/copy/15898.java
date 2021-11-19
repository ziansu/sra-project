@java.lang.Override
protected java.util.List<com.formakidov.rssreader.data.RssItem> doInBackground(java.lang.Void... params) {
    com.formakidov.rssreader.DatabaseManager manager = com.formakidov.rssreader.DatabaseManager.getInstance(getActivity());
    return manager.getAllNews(url);
}