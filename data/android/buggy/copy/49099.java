@java.lang.Override
public void onRefresh() {
    page = 0;
    if (com.zx.wfm.utils.NetWorkUtils.isNetworkConnected(getActivity())) {
        server.getTeleVisionDataFromNet(Constants.Net.TELEVISION_URL);
    }else {
        refreshCompelete(swipeToLoadLayout, movieAdapter.getmList());
    }
}