@java.lang.Override
protected void onStop() {
    com.afollestad.assent.Assent.setActivity(null);
    super.onStop();
}