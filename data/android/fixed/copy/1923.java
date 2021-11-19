public static void errorAndDone(org.rapidoid.http.Req req, java.lang.Throwable error, org.rapidoid.http.customize.ErrorHandler errorHandler) {
    org.rapidoid.http.impl.HttpIO.error(req, error, errorHandler);
    req.done();
}