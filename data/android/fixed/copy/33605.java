@java.lang.Override
public void onClick(android.view.View v) {
    if ((mDays) != 1) {
        (mDays)--;
        mDaysTextView.setText(java.lang.Integer.toString(mDays));
    }
}