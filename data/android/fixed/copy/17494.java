public int deleteMessage(long chatId, int messageId) throws java.io.IOException {
    return deleteMessage(java.lang.String.valueOf(chatId), messageId);
}