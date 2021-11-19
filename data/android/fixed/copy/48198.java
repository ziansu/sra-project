public com.treeter_client.Message.ErrorCodeResponse getErrorCode() {
    if (!(jsonObject.containsKey("error")))
        return ErrorCodeResponse.OK;
    else
        return com.treeter_client.Message.ErrorCodeResponse.valueOf(((java.lang.Long) (jsonObject.get("error"))));
    
}