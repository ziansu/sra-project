public void setStartTitle(java.lang.String startTitle) {
    android.widget.TabHost.TabSpec startDatePage = tabHost.newTabSpec("start");
    startDatePage.setIndicator(startTitle);
}