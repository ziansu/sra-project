private void restoreInstanceState(android.os.Bundle savedInstanceState) {
    com.jparkie.givesmehope.models.Anthology.getParcelable(savedInstanceState, mHotAnthology);
    mHotAdapter = new com.jparkie.givesmehope.views.adapters.HotAdapter(mHotView.getContext(), mHotAnthology.getStories());
    mHotView.setAdapterForRecyclerView(mHotAdapter);
}