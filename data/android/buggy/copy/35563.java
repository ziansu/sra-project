@java.lang.Override
public void defaultErrorMessage() {
    tobedevelopers.project_fury.ToastLog.makeWarn(this, getString(R.string.error_defaultError), Toast.LENGTH_LONG).show();
    mProjectDescriptionEditText.getEditableText().clear();
}