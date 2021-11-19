public void onActivityDestroyed(com.tns.Activity param_0) {
    if (ErrorReport.HasApplicationCreateError) {
        return ;
    }
    java.lang.Object[] params = new java.lang.Object[1];
    params[0] = param_0;
    com.tns.com.tns.Platform.callJSMethod(this, "onActivityDestroyed", void.class, params);
}