@java.lang.Override
public ca.nrc.cadc.vos.client.ClientRecursiveSetNode run() throws java.lang.Exception {
    final ca.nrc.cadc.vos.client.ClientRecursiveSetNode rj = voSpaceClient.setNodeRecursive(newNode);
    rj.setMonitor(false);
    rj.run();
    return rj;
}