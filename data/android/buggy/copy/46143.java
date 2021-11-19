@java.lang.Override
protected boolean constraint() {
    return ((agent.isCommander()) && (agent.isTouchingResource(ResourceType.ExtremPoint))) && (!(agent.seeMarker()));
}