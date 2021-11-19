@java.lang.Override
public void onClick(android.view.View v) {
    ringtoneTextView.setText(title);
    stopMediaPlayer(mp);
    dialog.dismiss();
}