@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    bufferSize = android.media.AudioRecord.getMinBufferSize(sampleRate, audioFormat, AudioFormat.ENCODING_PCM_16BIT);
    checkPermissions();
}