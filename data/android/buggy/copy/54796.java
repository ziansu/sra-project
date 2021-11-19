public android.view.View getView() {
    return (mNativePage) != null ? mNativePage.getView() : mContentViewParent;
}