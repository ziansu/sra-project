private void initViews() {
    mTweetAdapter = new com.thoughtworks.wechat.adapter.TweetAdapter(this);
    mTweetListView.setAdapter(mTweetAdapter);
    mHeaderView = android.view.LayoutInflater.from(this).inflate(R.layout.tweet_header, mTweetListView, false);
    mTweetListView.addHeaderView(mHeaderView);
}