@java.lang.Override
public void run() {
    org.ow2.proactive.scheduler.util.SchedulerStarter.logger.info("Shutting down...");
    if ((org.ow2.proactive.scheduler.util.SchedulerStarter.discoveryService) != null) {
        org.ow2.proactive.scheduler.util.SchedulerStarter.discoveryService.stop();
    }
    org.ow2.proactive.scheduler.util.SchedulerStarter.hsqldbServer.stop();
}