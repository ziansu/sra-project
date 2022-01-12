@java.lang.Override
public void inputClosed(org.apache.mina.core.session.IoSession session) throws java.lang.Exception {
    super.inputClosed(session);
    this.trigger(session, HandlerEventType.InputClosed, null);
}