@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    api = com.tencent.mm.sdk.openapi.WXAPIFactory.createWXAPI(this, com.wanke.tv.wxapi.WXEntryActivity.WX_APP_ID, false);
    api.registerApp(com.wanke.tv.wxapi.WXEntryActivity.WX_APP_ID);
    api.handleIntent(getIntent(), this);
}