@java.lang.Override
public void onSuccess(com.auth0.android.result.UserProfile payload) {
    java.lang.String account_type = payload.getUserMetadata().get("account_type").toString();
    java.lang.System.out.println(account_type);
}