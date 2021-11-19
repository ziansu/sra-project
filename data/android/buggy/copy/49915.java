public void init() {
    com.gyf.barlibrary.ImmersionBar.mMap.put(mActivity.getClass().getName(), mBarParams);
    setBarColor();
    transformView();
    fitsSystemWindows();
    com.apkfuns.logutils.LogUtils.d(com.gyf.barlibrary.ImmersionBar.mMap);
}