private void setClearOff() {
    setClear(true);
    btn_clear.setVisibility(View.GONE);
    setInputQueryLayout(R.id.activity_search_inputbar_btn_mic);
    if (android.speech.SpeechRecognizer.isRecognitionAvailable(getApplicationContext())) {
        btn_mic.setVisibility(View.VISIBLE);
    }
}