protected void setView(android.widget.ImageView imageView, int image_loading, int image_error) {
    mImageView = imageView;
    if ((mLoadingImage) != 0)
        mLoadingImage = image_loading;
    
    if ((mErrorImage) != 0)
        mErrorImage = image_error;
    
}