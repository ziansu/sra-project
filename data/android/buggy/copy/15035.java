private void redirectedAcordingToPn(int userinfo) {
    sendBroadcast(new android.content.Intent(Config.PUSH_NOTIFICATION).putExtra("userinfo", userinfo));
    viewPager.setCurrentItem(3, false);
    navigationTabBar.setModelIndex(3, false);
}