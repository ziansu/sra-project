@java.lang.Override
protected void onEntityEvent(brooklyn.networking.sdn.EventType type, org.apache.brooklyn.api.entity.Entity member) {
    ((brooklyn.networking.sdn.SdnProviderImpl) (entity)).onHostChanged(member);
}