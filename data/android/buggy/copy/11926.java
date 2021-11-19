private void handleIntent(android.content.Intent intent) {
    com.google.android.gms.common.api.Status status = intent.getParcelableExtra(pl.charmas.android.reactivelocation.observables.location.LocationSettingsActivity.ARG_STATUS);
    try {
        status.startResolutionForResult(this, pl.charmas.android.reactivelocation.observables.location.LocationSettingsActivity.REQUEST_CODE_RESOLUTION);
    } catch (android.content.IntentSender | java.lang.NullPointerException e) {
        setResolutionResultAndFinish(Activity.RESULT_CANCELED);
    }
}