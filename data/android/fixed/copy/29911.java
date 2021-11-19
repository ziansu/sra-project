public void send(io.datakernel.http.HttpRequest request, int timeout, io.datakernel.http.ResultCallback<io.datakernel.http.HttpResponse> callback) {
    assert eventloop.inEventloopThread();
    io.datakernel.util.Preconditions.checkNotNull(request);
    getUrlAsync(request, timeout, callback);
}