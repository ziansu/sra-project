protected void startLoadDialogMessages(com.quickblox.chat.model.QBDialog dialog, long lastDateLoad) {
    loadingMore = true;
    com.quickblox.q_municate_core.qb.commands.QBLoadDialogMessagesCommand.start(this, dialog, lastDateLoad, skipMessages);
    skipMessages += com.quickblox.q_municate_core.utils.ConstsCore.DIALOG_MESSAGES_PER_PAGE;
}