public static ontologizer.ArrayBufferHttpRequest create(java.lang.String method, java.lang.String url) {
    org.teavm.jso.ajax.XMLHttpRequest req = org.teavm.jso.ajax.XMLHttpRequest.create();
    req.open(method, url);
    req.setResponseType("arraybuffer");
    return req.cast();
}