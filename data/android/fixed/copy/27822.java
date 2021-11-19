@java.lang.Override
public void consoleTestSetUp() throws java.lang.Exception {
    humanTaskDatastore = new org.bonitasoft.web.rest.server.datastore.bpm.flownode.HumanTaskDatastore(getInitiator().getSession());
}