private static org.telegram.telegrambots.api.objects.replykeyboard.ForceReplyKeyboard getForceReply() {
    org.telegram.telegrambots.api.objects.replykeyboard.ForceReplyKeyboard forceReplyKeyboard = new org.telegram.telegrambots.api.objects.replykeyboard.ForceReplyKeyboard();
    forceReplyKeyboard.setSelective(true);
    return forceReplyKeyboard;
}