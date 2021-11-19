@java.lang.Override
public void updateFeedData(me.abrahanfer.geniusfeed.models.Feed newFeed) {
    mFeedList.add(newFeed);
    if ((mFeedListView.getAdapter()) != null)
        mFeedListView.getAdapter().notifyDataSetChanged();
    
    getFeedFromAPI();
}