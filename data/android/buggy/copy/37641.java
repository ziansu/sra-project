private void deleteCurrentImage() {
    mAdapter.removeImage(mImagePager.getCurrentImagePosition());
    mAdapter.notifyDataSetChanged();
}