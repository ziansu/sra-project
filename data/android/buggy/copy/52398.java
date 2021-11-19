public void run() {
    hideLoadingAnimation();
    mImageView.setVisibility(View.VISIBLE);
    mImageView.setImageURI(android.net.Uri.parse(path));
    mAttacher.update();
}