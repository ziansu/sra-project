private static java.lang.String getDialogTitle() {
    int stringId = R.string.dialog_title_pull_response;
    return org.eyeseetea.malariacare.data.database.utils.PreferencesState.getInstance().getContext().getString(stringId);
}