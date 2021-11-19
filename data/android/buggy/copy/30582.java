@java.lang.Override
protected void onPostExecute(com.buzzilla.webhose.client.WebhoseResponse webhoseResponse) {
    if (webhoseResponse != null) {
        mAdapter = new org.zikalert.NewsAdapter(webhoseResponse.posts);
        mRecyclerView.setAdapter(mAdapter);
    }
}