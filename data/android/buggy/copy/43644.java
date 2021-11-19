@java.lang.Override
public void onTick(long millisUntilFinished) {
    int progress = ((int) (millisUntilFinished / 1000));
    button.setEnabled(false);
    textview.setText(java.lang.Integer.toString(progress));
}