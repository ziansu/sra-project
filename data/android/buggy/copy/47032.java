public void sendMessage(java.lang.String newMessage) {
    project.dos.BattlefieldLogic.message = newMessage;
    messageSender.run();
}