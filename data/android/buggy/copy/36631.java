private void restoreInstanceState(android.os.Bundle savedInstanceState) {
    com.jparkie.givesmehope.models.Anthology.getParcelable(savedInstanceState, mTrendingAnthology);
    mTrendingAdapter = new com.jparkie.givesmehope.views.adapters.TrendingAdapter(mTrendingAnthology.getStories());
    mTrendingView.setAdapterForRecyclerView(mTrendingAdapter);
}