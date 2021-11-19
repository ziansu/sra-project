@java.lang.Override
protected java.lang.Boolean doInBackground(com.lucien.hkmdemo.model.AccountModel... params) {
    com.lucien.hkmdemo.api.ApiHelper.loginAccount(api, params[0]);
    return true;
}