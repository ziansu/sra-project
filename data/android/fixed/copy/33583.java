public void showImage(int position) {
    ownContainer.findViewWithTag(("image" + position)).setVisibility(View.VISIBLE);
}