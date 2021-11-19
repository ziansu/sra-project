public void execute(io.datakernel.http.HttpRequest request, int timeout, io.datakernel.http.ResultCallback<io.datakernel.http.HttpResponse> callback) {
    io.datakernel.util.Preconditions.checkNotNull(request);
    assert eventloop.inEventloopThread();
    totalRequests.recordEvent();
    getUrlAsync(request, timeout, callback);
}