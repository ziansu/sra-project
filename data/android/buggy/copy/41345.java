public void onTimeUp() {
    showMessage(getString(R.string.time_up_message));
    submit((-1));
    clockControl.setVisibility(View.INVISIBLE);
}