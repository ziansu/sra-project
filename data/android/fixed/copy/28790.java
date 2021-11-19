private synchronized void failControllers() {
    for (us.mn.state.dot.tms.server.ControllerImpl c : controllers.values())
        c.setFailed(true);
    
    updateStatus();
}