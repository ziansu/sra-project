@org.mozilla.gecko.annotation.ReflectionTarget
public static synchronized void onCreate(android.content.Context context) {
    if ((org.mozilla.gecko.push.PushService.sInstance) != null) {
        throw new java.lang.IllegalStateException("PushService already created!");
    }
    org.mozilla.gecko.push.PushService.sInstance = new org.mozilla.gecko.push.PushService(context);
    org.mozilla.gecko.push.PushService.sInstance.registerGeckoEventListener();
    org.mozilla.gecko.push.PushService.sInstance.onStartup();
}