@java.lang.Override
protected void onPostResume() {
    super.onPostResume();
    if (mRecreateActivity) {
        mRecreateActivity = false;
        mViewPager.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                recreate();
            }
        });
    }
}