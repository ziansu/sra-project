public void removeAllSliders() {
    mSlederViews.clear();
    mDataChangeListener.notifyDataChange();
    notifyDataSetChanged();
}