@java.lang.Override
public void setProgressIndicator(boolean active) {
    if (active) {
        mStatisticsTV.setText(getString(R.string.loading));
    }else {
        mStatisticsTV.setText("");
    }
}