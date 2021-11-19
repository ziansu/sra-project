@java.lang.Override
public void onFailure(retrofit2.Call<com.sharekeg.streetpal.userinfoforlogin.UserInfoForLogin> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(this, R.string.smthing_went_wrong, Toast.LENGTH_SHORT).show();
}