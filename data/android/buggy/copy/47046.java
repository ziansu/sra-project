public static com.okhttplib.OkHttpUtil.Builder init(android.app.Application context) {
    com.okhttplib.OkHttpUtil.application = context;
    com.okhttplib.OkHttpUtil.application.registerActivityLifecycleCallbacks(new com.okhttplib.callback.BaseActivityLifecycleCallbacks());
    return com.okhttplib.OkHttpUtil.BuilderGlobal();
}