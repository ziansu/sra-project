private org.eclipse.core.runtime.IStatus createStatusForError(java.lang.String message) {
    if (errorAsInfo) {
        return org.eclipse.core.databinding.validation.ValidationStatus.info(message);
    }else {
        return org.eclipse.core.databinding.validation.ValidationStatus.error(message);
    }
}