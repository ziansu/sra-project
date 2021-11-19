@java.lang.Override
public void onStart() {
    super.onStart();
    final android.view.View decorView = getDialog().getWindow().getDecorView();
    decorView.animate().alphaBy(0.1F).setDuration(1000).start();
}