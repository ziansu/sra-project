private synchronized void failControllers() {
    if ((poller) != null)
        poller.destroyCommThread();
    
    for (us.mn.state.dot.tms.server.ControllerImpl c : controllers.values())
        c.setFailed(true);
    
    updateStatus();
}