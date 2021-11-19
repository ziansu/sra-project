@java.lang.Override
public void newFeedsreceived(java.util.ArrayList<com.projektarbeit.rss_feeder.control.Feed> feeds) {
    content = feeds;
    if ((dbModel) != null) {
        dbModel.saveFeeds(feeds);
        dbModel.loadAllFeeds();
    }
}