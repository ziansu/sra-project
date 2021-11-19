@java.lang.Override
public void onAttach(final android.app.Activity activity) {
    super.onAttach(activity);
    this.activity = activity;
    this.application = ((de.schildbach.wallet.WalletApplication) (activity.getApplication()));
    this.packageManager = activity.getPackageManager();
}