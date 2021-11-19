@org.junit.Test
public void testErrorMessage_ExceptionWithoutMessage() {
    java.lang.RuntimeException ex = new java.lang.RuntimeException();
    org.eclipse.core.runtime.IStatus status = com.google.cloud.tools.eclipse.appengine.newproject.StandardProjectWizard.setErrorStatus(this, ex);
    org.junit.Assert.assertEquals("Failed to create project", status.getMessage());
}