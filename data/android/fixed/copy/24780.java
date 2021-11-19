public void run() {
    mRootLayout.setGravity(((Gravity.CENTER_HORIZONTAL) | (Gravity.BOTTOM)));
    mRootLayout.addView(mNendAdView, new com.effers.kaky.nend.LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
    mNendAdView.loadAd();
    callbackContext.success();
}