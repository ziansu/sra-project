public void handle(server.Conversation conversation) {
    java.lang.System.out.println("handle");
    if (conversation.getRequestedURI().startsWith("/docent/absentienoteren/ophalen")) {
        ophalen(conversation);
    }
}