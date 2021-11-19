@android.annotation.TargetApi(value = Build.VERSION_CODES.ICE_CREAM_SANDWICH)
private void selectItem(final int position) {
    mDrawerLayout.closeDrawer(mDrawerList);
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            onPostClosed(position);
        }
    }, 200);
}