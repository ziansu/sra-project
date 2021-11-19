public static java.util.ArrayList<com.MCIT.raf.data.Request> getRequest() {
    if (com.MCIT.raf.data.CurrentUser.requests.isEmpty()) {
        com.MCIT.raf.data.CurrentUser.requests = com.MCIT.raf.data.Request.getUserRequest();
    }
    return com.MCIT.raf.data.CurrentUser.requests;
}