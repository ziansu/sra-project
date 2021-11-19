private java.lang.Boolean isEditableMessage(org.esbtools.message.admin.model.EsbMessage message) {
    return org.esbtools.message.admin.common.config.EMAConfiguration.getEditableMessageTypes().contains(message.getMessageType().toUpperCase());
}