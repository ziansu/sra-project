@java.lang.Override
public org.sapia.corus.client.common.ProgressQueue commit() throws java.io.IOException {
    close();
    log.debug("Committing deployment");
    org.sapia.ubik.util.Assertions.illegalState(((queue) != null), "Deployment already committed");
    return handler.completeDeployment(meta, destFile);
}