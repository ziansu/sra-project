private boolean SaveData() {
    ActivityMain.mainUser.SaveDiaryEntry(diaryEntry);
    android.widget.Toast.makeText(this, R.string.Tagebucheintraggespeichert, Toast.LENGTH_SHORT).show();
    return true;
}