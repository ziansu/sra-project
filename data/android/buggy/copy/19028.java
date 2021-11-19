public void returnSpeech(android.content.Intent data) {
    modelI.presenter.doneListening(data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS));
}