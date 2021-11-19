void speakToFile() {
    mTts.speakToFile(poem.get());
    snackbarText.set(new ca.rmen.android.poetassistant.main.reader.ReaderViewModel.SnackbarText(R.string.share_poem_audio_snackbar));
}