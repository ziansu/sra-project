private void onRequestComplete(com.google.protobuf.RpcController controller) {
    se.qxx.android.tools.ResponseMessage msg = checkResponse(controller);
    if ((this.getListener()) != null)
        this.listener.onRequestComplete(msg);
    
}