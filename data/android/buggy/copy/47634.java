private void noSpdy(final com.koushikdutta.async.http.spdy.GetSocketData data, java.lang.String key) {
    com.koushikdutta.async.http.spdy.SpdyMiddleware.SpdyConnectionWaiter conn = connections.remove(key);
    if (conn != null)
        conn.setComplete(com.koushikdutta.async.http.spdy.SpdyMiddleware.NO_SPDY);
    
    data.request.logv("not using spdy");
}