public static ontologizer.ArrayBufferHttpRequest create() {
    org.teavm.jso.ajax.XMLHttpRequest req = org.teavm.jso.ajax.XMLHttpRequest.create();
    req.setResponseType("arraybuffer");
    return req.cast();
}