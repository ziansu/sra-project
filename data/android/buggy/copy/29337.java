protected void addTab(java.lang.String id, java.lang.String title, java.lang.Class<? extends android.support.v4.app.Fragment> fragment, android.os.Bundle args) {
    mTabsAdapter.addTab(mTabHost.newTabSpec(id).setIndicator(title), fragment, args);
}