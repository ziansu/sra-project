@java.lang.Override
protected void onPostCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    progressBarOnTop.setVisibility(View.VISIBLE);
    loadFeeds(tabLayout.getTabAt(0).getText().toString());
}