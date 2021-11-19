private void initData() {
    if (com.blankj.utilcode.utils.NetworkUtils.isConnected()) {
        bmobData();
    }else {
        myApplication.showToast("\u5f53\u524d\u65e0\u7f51\u7edc!\n\u8bf7\u6253\u5f00\u7f51\u7edc\u540e\u91cd\u8bd5");
    }
    swipeRefreshLayout.setRefreshing(false);
}