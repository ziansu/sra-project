public void loadStrings(java.util.List<java.lang.String> strings) {
    mLoadType = com.goka.kenburnsview.KenBurnsView.LoadType.String;
    mStrings = strings;
    if ((mRootLayout) != null) {
        initImageViews(mRootLayout);
    }
}