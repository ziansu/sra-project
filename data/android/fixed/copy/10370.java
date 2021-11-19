@java.lang.Override
public void onSuccess(com.facebook.login.LoginResult loginResult) {
    myKitabPresenter.onSuccess(loginResult);
    android.content.Intent intent = new android.content.Intent(getActivity(), com.sujan.mykitaab.MainActivity.class);
    startActivity(intent);
}