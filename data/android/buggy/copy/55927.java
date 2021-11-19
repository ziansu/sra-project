@java.lang.Override
public void before(final java.lang.reflect.Method method, final java.lang.Object[] arg1, final java.lang.Object arg2) throws java.lang.Throwable {
    org.audit4j.core.AuditManager manager = org.audit4j.core.AuditManager.getInstance();
    manager.audit(method.getClass(), method, arg1);
}