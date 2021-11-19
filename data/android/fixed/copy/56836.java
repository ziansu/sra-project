@java.lang.Override
protected void onFinishInflate() {
    super.onFinishInflate();
    mForegroundView = ((com.xenione.libs.swipemaker.SwipeLayout) (findViewById(R.id.foregroundView)));
    mForegroundView.setOnTranslateChangeListener(this);
}