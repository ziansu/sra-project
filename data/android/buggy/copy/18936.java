@java.lang.Override
public void onRefresh() {
    pb.setVisibility(View.VISIBLE);
    CLog.Companion.d(com.catherine.webservices.fragments.P05_Gallery.TAG, "refresh");
    srl_container.setRefreshing(false);
    fillInData();
}