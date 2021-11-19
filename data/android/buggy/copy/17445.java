protected void onProgressUpdate(java.lang.Integer... progress) {
    tvStart.setText(formatMilliToHMS(progress[0]));
    seekBar.setProgress(progress[0]);
}