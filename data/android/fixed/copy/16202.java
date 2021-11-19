public void removeAllHeaderView() {
    if ((mHeaderLayout) == null)
        return ;
    
    mHeaderLayout.removeAllViews();
    mHeaderLayout = null;
}