public void loadStrings(java.util.List<java.lang.String> strings) {
    mLoadType = com.goka.kenburnsview.KenBurnsView.LoadType.String;
    com.goka.kenburnsview.KenBurnsView.sCachedSizeForLoadType = 0;
    mStrings = strings;
    if ((mRootLayout) != null) {
        initImageViews(mRootLayout);
    }
}