protected int getDatasetPosition(int argPosition) {
    if ((mSortOrder) == (org.bottiger.podcast.activities.feedview.FeedViewAdapter.RECENT_FIRST))
        return argPosition;
    
    return ((getItemCount()) - argPosition) - 1;
}