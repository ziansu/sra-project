@java.lang.Override
public void onClick(android.view.View v) {
    mButton.setText(R.string.start_listening);
    com.afollestad.digitus.Digitus.get().openSecuritySettings();
}