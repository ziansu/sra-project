protected void fireExceptionHandler(java.lang.Exception ex) throws net.koofr.api.v2.StorageApiException {
    if ((xhandler) != null) {
        if (xhandler.handle(ex)) {
            throw new net.koofr.api.v2.StorageApiException(ex);
        }
    }
}