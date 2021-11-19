@java.lang.Override
public void done(io.cloudboost.CloudUser user, io.cloudboost.CloudException e) throws io.cloudboost.CloudException {
    android.content.Intent in = new android.content.Intent(this, com.gusycorp.travel.activity.Login.TripLoginActivity.class);
    startActivity(in);
    finish();
}