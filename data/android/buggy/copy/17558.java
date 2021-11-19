public void loadInitialData() {
    java.lang.String message = getString(org.hisp.dhis.android.sdk.R.string.finishing_up);
    org.hisp.dhis.android.sdk.utils.UiUtils.postProgressMessage(message);
    org.hisp.dhis.android.sdk.controllers.DhisService.loadInitialData(this);
}