@java.lang.Override
public void run() {
    org.fourthline.cling.UpnpServiceImpl.log.info(">>> Shutting down UPnP service...");
    shutdownRegistry();
    shutdownConfiguration();
    shutdownRouter();
    org.fourthline.cling.UpnpServiceImpl.log.info("<<< UPnP service shutdown completed");
}