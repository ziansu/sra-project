@java.lang.Override
public void run() {
    dataSet.refreshLayout.setRefreshing(false);
    currentSelectedItem = s;
    dataSet.loadMore(this, submission.getSubredditName());
}