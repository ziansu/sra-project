@java.lang.Override
public void onSuccess(de.hdm.partnerboerse.shared.LoginInfo result) {
    if (result.isLoggedIn()) {
        onModuleLoadLoggedIn(result.getProfile());
    }else {
        Window.Location.replace(result.getLoginUrl());
    }
}