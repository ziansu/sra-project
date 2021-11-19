@java.lang.Override
public void onEnabled(android.content.Context context) {
    super.onEnabled(context);
    android.content.Intent intent = new android.content.Intent(de.reikodd.meinwidget.MainActivity.UpdateTimeService.UPDATE);
    intent.setPackage("de.reikodd.meinwidget");
    context.startService(intent);
    de.reikodd.meinwidget.MainActivity.mcontext = context;
}