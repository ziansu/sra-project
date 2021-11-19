@java.lang.Override
public void onFailure(retrofit2.Call<valet.intan.com.valetparking.domain.AuthResponse.MetaContainer> call, java.lang.Throwable t) {
    android.util.Log.d(valet.intan.com.valetparking.service.RefreshTokenService.TAG, ("onFailure: refresh token failure occured: " + (t.getMessage())));
    loggingUtils.logRefreshTokenError(t.getMessage());
}