protected boolean isClusteredEventBus(final tigase.xmpp.JID jid) {
    return (jid.getLocalpart().equals("eventbus")) && (context.getConnectedNodes().contains(jid.getDomain()));
}