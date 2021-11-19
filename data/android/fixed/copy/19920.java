@org.junit.Test
public void testErrorMessage_Exception() {
    java.lang.RuntimeException ex = new java.lang.RuntimeException("testing");
    org.eclipse.core.runtime.IStatus status = com.google.cloud.tools.eclipse.appengine.newproject.StandardProjectWizard.setErrorStatus(this, ex);
    org.junit.Assert.assertEquals("Failed to create project: testing", status.getMessage());
}