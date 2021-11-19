public void send(final io.datakernel.http.HttpRequest request, final int timeout, final io.datakernel.http.ResultCallback<io.datakernel.http.HttpResponse> callback) {
    assert eventloop.inEventloopThread();
    io.datakernel.util.Preconditions.checkNotNull(request);
    getUrlAsync(request, timeout, callback);
}