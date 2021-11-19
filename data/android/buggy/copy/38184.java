public static boolean openQuestion(org.eclipse.swt.widgets.Shell parent, java.lang.String title, java.lang.String message) {
    return org.entirej.applicationframework.rwt.application.EJRWTMessenger.EJMessageDialog.open(MessageDialog.QUESTION, parent, title, message, SWT.NONE);
}