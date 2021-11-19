@java.lang.Override
public void sessionOpened(org.apache.mina.core.session.IoSession s5Session) throws java.lang.Exception {
    s5Session.getConfig().setIdleTime(IdleStatus.BOTH_IDLE, 30);
    s5Session.getConfig().setUseReadOperation(true);
}