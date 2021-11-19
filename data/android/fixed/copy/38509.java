@java.lang.Override
public void onRefresh() {
    boolean connect = whetherNetworkConnected();
    if (connect)
        requestRepliesInfo(true);
    
}