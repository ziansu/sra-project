@java.lang.Override
public void refreshData(boolean pullToRefresh, boolean staleRefresh) {
    queueRequest(new net.fastfourier.something.request.PrivateMessageRequest(getActivity(), pmId, pmTitle, this, this));
}