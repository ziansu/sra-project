private void noSpdy(java.lang.String key) {
    com.koushikdutta.async.http.spdy.SpdyMiddleware.SpdyConnectionWaiter conn = connections.remove(key);
    if (conn != null)
        conn.setComplete(com.koushikdutta.async.http.spdy.SpdyMiddleware.NO_SPDY);
    
}