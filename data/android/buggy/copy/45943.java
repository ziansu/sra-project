public void post(java.lang.String target, org.usfirst.frc.team4141.MDRobotBase.notifications.RobotNotification notification) {
    if (eventManager.isWebSocketsEnabled()) {
        eventManager.post(notification);
    }
}