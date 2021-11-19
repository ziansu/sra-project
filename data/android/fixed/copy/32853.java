public void scheduledRecordingStopped() {
    android.util.Log.d(com.danielkim.soundrecorder.fragments.RecordFragment.TAG, "RecordFragment - scheduledRecordingStopped");
    updateUI(false, null);
    isRecording = false;
}