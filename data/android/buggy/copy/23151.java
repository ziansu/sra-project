public javax.ws.rs.core.Response lightOff() {
    javax.ws.rs.core.Response response = sendPostRequest("off");
    if ((response.getStatus()) == (javax.ws.rs.core.Response.ok().build().getStatus()))
        isSwitchOn = true;
    
    return response;
}