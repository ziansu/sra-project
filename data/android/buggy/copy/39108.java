@java.lang.Override
public void handle(org.vertx.java.core.json.JsonObject event) {
    logger.info(("Completed Delete Event: " + event));
    com.deblox.Util.unRegisterHandler(eb, getMandatoryString("id", message), this);
    message.reply(event);
}