public net.java.slee.resource.diameter.ro.RoClientSessionActivity createRoClientSessionActivity(net.java.slee.resource.diameter.base.events.avp.DiameterIdentity destinationHost, net.java.slee.resource.diameter.base.events.avp.DiameterIdentity destinationRealm) throws net.java.slee.resource.diameter.base.CreateActivityException {
    org.mobicents.slee.resource.diameter.ro.RoClientSessionActivityImpl clientSession = ((org.mobicents.slee.resource.diameter.ro.RoClientSessionActivityImpl) (this.createRoClientSessionActivity()));
    clientSession.setDestinationHost(destinationHost);
    clientSession.setDestinationRealm(destinationRealm);
    return clientSession;
}