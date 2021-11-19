public boolean isScreenLarge() {
    final int screenSize = (getResources().getConfiguration().screenLayout) & (android.content.res.Configuration.SCREENLAYOUT_SIZE_MASK);
    return screenSize == (android.content.res.Configuration.SCREENLAYOUT_SIZE_XLARGE);
}