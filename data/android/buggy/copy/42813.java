public static final void messageListenerHook(int type, java.lang.String name, java.lang.String message, java.lang.String title) {
    final org.rev317.min.api.events.MessageEvent messageEvent = new org.rev317.min.api.events.MessageEvent(type, name, message, title);
    org.rev317.min.script.ScriptEngine.getInstance().dispatch(messageEvent);
}