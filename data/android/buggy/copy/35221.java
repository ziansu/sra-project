public void resumeReading() {
    com.japanzai.koroshiya.reader.MainActivity.startReading(settings.getLastFileRead().getAbsolutePath(), settings.getLastFileReadIndex(), this);
}