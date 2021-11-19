public void onMessageReceived(java.lang.String text) {
    mission.processResponse(text);
    sender.send(mission.getPrompt());
}