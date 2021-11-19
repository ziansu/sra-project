public void sortAmount() {
    java.util.Collections.sort(com.johnsimon.payback.ui.FeedActivity.feed, new com.johnsimon.payback.util.Resource.AmountComparator());
    FeedFragment.adapter.updateList(com.johnsimon.payback.ui.FeedActivity.feed);
    FeedFragment.adapter.notifyDataSetChanged();
}