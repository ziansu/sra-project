@java.lang.Override
public void initialize(javax.security.auth.message.MessagePolicy requestPolicy, javax.security.auth.message.MessagePolicy responsePolicy, javax.security.auth.callback.CallbackHandler handler, java.util.Map options) throws javax.security.auth.message.AuthException {
    this.requestPolicy = requestPolicy;
    this.responsePolicy = responsePolicy;
    this.handler = handler;
    this.options = options;
    this.success = false;
}