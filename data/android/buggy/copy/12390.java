private static com.quickblox.q_municate_db.models.Message createTempLocalMessage(long messageId, com.quickblox.q_municate_db.models.DialogOccupant dialogOccupant, java.lang.String body, long createdDate, com.quickblox.q_municate_db.models.State state) {
    com.quickblox.q_municate_db.models.Message message = com.quickblox.q_municate_core.utils.ChatUtils.createTempLocalMessage(messageId, dialogOccupant, body, state);
    message.setCreatedDate(createdDate);
    return message;
}