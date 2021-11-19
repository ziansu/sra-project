private void launchPlayMenuActivity(final java.lang.String romPath) {
    paulscode.android.mupen64plusae.util.Notifier.showToast(this, java.lang.String.format(getString(R.string.toast_loadingGameInfo)));
    new paulscode.android.mupen64plusae.task.ComputeMd5Task(new java.io.File(romPath), this).execute();
}