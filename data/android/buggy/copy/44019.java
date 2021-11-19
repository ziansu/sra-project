public org.telegram.telegrambots.updatesreceivers.BotSession registerBot(org.telegram.telegrambots.bots.TelegramLongPollingBot bot) throws org.telegram.telegrambots.TelegramApiException {
    setWebhook(bot.getBotToken(), null);
    return new org.telegram.telegrambots.updatesreceivers.BotSession(bot.getBotToken(), bot, bot.getOptions());
}