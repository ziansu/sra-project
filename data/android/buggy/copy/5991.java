private int getTabsCount() {
    android.widget.TextView currentView = ((android.widget.TextView) (getTabsCounter().getCurrentView()));
    java.lang.String tabsCountText = currentView.getText().toString();
    return java.lang.Integer.parseInt(tabsCountText);
}