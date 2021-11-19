@java.lang.Override
public void setup(com.datatorrent.api.Context.OperatorContext context) {
    uriHelper(context);
    super.setup(context);
    com.datatorrent.lib.io.PubSubWebSocketAppDataResult.logger.debug("Setting up:\nuri:{}\ntopic:{}", this.getUri(), this.getTopic());
}