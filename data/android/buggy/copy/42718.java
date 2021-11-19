@java.lang.Override
public void finish() {
    super.finish();
    org.jboss.reddeer.common.wait.AbstractWait.sleep(TimePeriod.SHORT);
    new org.jboss.reddeer.workbench.impl.shell.WorkbenchShell();
}