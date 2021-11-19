public java.lang.String run() {
    try {
        io.spacedog.client.SpaceRequest.post("/1/snapshot").superdogAuth().go(202);
    } catch (java.lang.Exception e) {
        return io.spacedog.admin.AdminJobs.error(this, e);
    }
    return "OK";
}