@java.lang.Override
public void close() throws java.io.IOException {
    this.stopContainer(containerName);
    super.close();
    org.hobbit.odin.systems.virtuoso.VirtuosoSystemAdapter.LOGGER.info("Virtuoso has stopped.");
}