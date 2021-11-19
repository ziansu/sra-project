protected void onProgressUpdate(java.lang.Integer... progress) {
    seekBar.setProgress(progress[0]);
    tvStart.setText(formatMilliToHMS(progress[0]));
}