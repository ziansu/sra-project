private void loadTopic() {
    mListView = ((android.widget.ListView) (findViewById(R.id.topic_list)));
    MAdapter = new com.lincanbin.carbonforum.adapter.IndexAdapter(this);
    new com.lincanbin.carbonforum.index.indexModel().execute(((com.lincanbin.carbonforum.config.ApiAddress.HOME_URL) + "1"));
}