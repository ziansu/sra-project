@java.lang.Override
public void onCreate(android.os.Bundle bundle, org.smssecure.smssecure.crypto.MasterSecret masterSecret) {
    super.onCreate(bundle, masterSecret);
    action.setVisibility(View.GONE);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}