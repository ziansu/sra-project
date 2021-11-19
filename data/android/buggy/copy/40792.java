public static void init(android.app.Application application) {
    com.vk.sdk.VKSdk.initialize(application);
    com.facebook.FacebookSdk.sdkInitialize(application.getApplicationContext());
}