public void loadResourceIDs(java.util.List<java.lang.Integer> resourceIDs) {
    mLoadType = com.goka.kenburnsview.KenBurnsView.LoadType.ResourceID;
    com.goka.kenburnsview.KenBurnsView.sCachedSizeForLoadType = 0;
    mResourceIDs = resourceIDs;
    if ((mRootLayout) != null) {
        initImageViews(mRootLayout);
    }
}