private org.eclipse.core.runtime.IStatus createStatusForError(java.lang.String message) {
    if (validationErrorAsInfo) {
        return org.eclipse.core.databinding.validation.ValidationStatus.info(com.google.cloud.tools.eclipse.appengine.deploy.ui.Messages.getString("error.account.missing.signedout"));
    }else {
        return org.eclipse.core.databinding.validation.ValidationStatus.error(com.google.cloud.tools.eclipse.appengine.deploy.ui.Messages.getString("error.account.missing.signedout"));
    }
}