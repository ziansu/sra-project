static walkingdevs.http11.RespNoBody mk(int status, java.lang.String statusMsg, walkingdevs.http11.Headers headers) {
    java.lang.System.out.println(status);
    java.lang.System.out.println(statusMsg);
    java.lang.System.out.println(headers);
    return new walkingdevs.http11.RespNoBodyImpl(status, statusMsg, headers);
}