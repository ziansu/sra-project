public void setData(java.util.List<com.ericsender.android_nanodegree.popmovie.parcelable.ReviewListObj> data) {
    int v = (data.isEmpty()) ? android.view.View.GONE : android.view.View.VISIBLE;
    mReviewListView.setVisibility(v);
    mRowObjs = data;
    notifyDataSetChanged();
}