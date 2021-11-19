private void setClearOn() {
    setClear(false);
    if (android.speech.SpeechRecognizer.isRecognitionAvailable(getApplicationContext())) {
        btn_mic.setVisibility(View.GONE);
    }
    setInputQueryLayout(R.id.activity_search_inputbar_btn_clear);
    btn_clear.setVisibility(View.VISIBLE);
}