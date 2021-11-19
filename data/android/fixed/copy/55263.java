private void hideProgress() {
    if (((mContent) == null) || ((mProgress) == null))
        return ;
    
    mContent.setVisibility(View.VISIBLE);
    mProgress.setVisibility(View.GONE);
}