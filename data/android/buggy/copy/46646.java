public void fetchCalls(int callType, long newerThan, int sub) {
    cancelFetch();
    int requestId = newCallsRequest();
    fetchCalls(com.android.dialer.calllog.CallLogQueryHandler.QUERY_CALLLOG_TOKEN, requestId, callType, false, newerThan, sub);
}