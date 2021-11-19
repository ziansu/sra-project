@java.lang.Override
public void consoleTestSetUp() throws java.lang.Exception {
    this.humanTaskDatastore = new org.bonitasoft.web.rest.server.datastore.bpm.flownode.HumanTaskDatastore(getInitiator().getSession());
}