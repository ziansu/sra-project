private void abandonQuest(java.lang.String questId) {
    DailiesPacketHandler.INSTANCE.sendToServer(new net.torocraft.dailies.messages.AbandonQuestRequest(questId));
}