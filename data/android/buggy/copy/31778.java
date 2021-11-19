public void run() {
    addMember(r.entityId, address.host, Core.DEFAULT_SERVICE_PORT, address.port, ses);
    service.checkDependencies();
}