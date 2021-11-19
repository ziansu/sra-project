public void sessionClosed(org.apache.mina.core.session.IoSession session) throws java.lang.Exception {
    java.lang.System.out.println(session.getId());
    java.lang.System.out.println("sessionClosed");
    sessions.remove(session);
    simpleListener.offLine();
}