@java.lang.Override
public void run() {
    try {
        updateRequestDB();
    } catch (java.lang.Exception e) {
        org.fogbowcloud.manager.core.ManagerController.LOGGER.error("Could not update the database.", e);
    }
}