private void getData(java.lang.String s) {
    if ("下拉刷新".equals(s)) {
        getMicroList(0, true);
        listview.onRefreshComplete();
    }else {
        getMicroList(now, true);
        listview.onLoadMoreComplete();
    }
}