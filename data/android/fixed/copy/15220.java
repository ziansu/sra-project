public void onSuccess(org.raven.net.Response response) {
    try {
        processServiceResponse(ev, ctx, response, true);
    } catch (java.lang.Throwable ex) {
        processResponseError(ctx, ex, ev);
    }
}