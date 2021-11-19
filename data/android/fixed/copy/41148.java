public void sortAmount() {
    java.util.Collections.sort(FeedFragment.adapter.list, new com.johnsimon.payback.util.Resource.AmountComparator());
    FeedFragment.adapter.notifyDataSetChanged();
}