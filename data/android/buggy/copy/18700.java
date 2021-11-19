@java.lang.Override
public java.util.ArrayList<rover.messaging.AMessage> getNewMessages() {
    retrieveMessages();
    java.util.Set<java.lang.String> newMessages = this.messages;
    this.messages.clear();
    return rover.messaging.MessageParser.parse(newMessages);
}