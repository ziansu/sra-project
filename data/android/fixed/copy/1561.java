public com.craigstockton.teksystems.state.service.StateInfoResponse get() {
    javax.ws.rs.core.Response response = request.get();
    return com.craigstockton.teksystems.state.service.StateInfoResponse.getInstance(response);
}