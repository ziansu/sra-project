public java.lang.String getMessagesPlayer() {
    java.lang.String msg = getData().getString("Messages.Player", getData().getString("Messages.Reward", ""));
    return msg;
}