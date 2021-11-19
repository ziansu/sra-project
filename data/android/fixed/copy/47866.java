@java.lang.Override
public void handleCommand(net.minecraft.command.ICommandSender sender, java.lang.String[] arguments) {
    sendChat(sender, (hardcorequesting.quests.QuestingData.isQuestActive() ? "hqm.message.questAlreadyActivated" : "hqm.message.questActivated"));
    hardcorequesting.quests.QuestingData.activateQuest(true);
}