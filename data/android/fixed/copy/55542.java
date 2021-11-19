private void postAnswer() {
    final java.lang.String adjustedAnswer = this.mPlayerAnswer;
    this.mChat.submitMessage(adjustedAnswer, de.zabuza.parbot.service.routine.Routine.CHAT_TYPE_RESTRICTION);
}