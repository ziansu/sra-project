public static com.okhttplib.OkHttpUtil.Builder init(android.content.Context context) {
    com.okhttplib.OkHttpUtil.context = context;
    ((android.app.Application) (com.okhttplib.OkHttpUtil.context)).registerActivityLifecycleCallbacks(new com.okhttplib.callback.BaseActivityLifecycleCallbacks());
    return com.okhttplib.OkHttpUtil.BuilderGlobal();
}