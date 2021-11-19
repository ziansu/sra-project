@org.androidannotations.annotations.AfterViews
void init() {
    setAppAuth();
    manageCookies();
    getGlobalConfig();
}