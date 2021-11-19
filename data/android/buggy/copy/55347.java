public static void newOutMessage(android.content.Context ctx, org.spinsuite.sync.content.SyncMessage message) {
    org.spinsuite.bchat.model.SPS_BC_Message.newMessage(ctx, message, MQTTDefaultValues.TYPE_OUT);
}