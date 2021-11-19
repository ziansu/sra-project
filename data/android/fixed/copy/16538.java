public void remove(int position) {
    mCityLab.delete(mDataset.get(position));
    mDataset = mCityLab.getCities();
    notifyItemRemoved(position);
}