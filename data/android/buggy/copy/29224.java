public int sendVideoNote(int chatId, java.io.InputStream videoNote, int replyTo, se.anyro.tgbotapi.types.reply_markup.ReplyMarkup replyMarkup) throws java.io.IOException {
    return sendVideoNote(java.lang.String.valueOf(chatId), videoNote, replyTo, replyMarkup);
}