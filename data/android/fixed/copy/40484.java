@org.junit.After
public void tearDown() throws java.lang.Exception {
    session.dispose();
    session = null;
    auditLogService.clear();
    auditLogService = null;
    org.jbpm.persistence.util.PersistenceUtil.cleanUp(context);
}