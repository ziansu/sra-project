@java.lang.Override
public java.lang.Boolean proceed(final android.content.Intent intent) {
    return com.oasisfeng.condom.CondomContext.super.bindService(intent, conn, flags);
}