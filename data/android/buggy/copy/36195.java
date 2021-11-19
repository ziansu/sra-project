@java.lang.Override
public void run() {
    dataSet.refreshLayout.setRefreshing(false);
    dataSet.loadMore(this, submission.getSubredditName());
    currentSelectedItem = s;
}