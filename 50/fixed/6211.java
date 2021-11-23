@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    ((org.wordpress.android.WordPress) (context.getApplicationContext())).component().inject(this);
    super.onReceive(context, intent);
}