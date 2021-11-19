@java.lang.Override
public void onSessionStarted(gameVoiceHandler.SessionStartedRequest sessionStartedRequest, gameVoiceHandler.Session session) throws gameVoiceHandler.SpeechletException {
    gameVoiceHandler.StateManager.getInstance().reset();
}