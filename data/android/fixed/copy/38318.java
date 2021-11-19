@java.lang.Override
public void onClick(android.view.View view) {
    int record = 0;
    if (record == 0) {
        startRecording();
        record = 1;
    }else {
        stopRecording();
        record = 0;
    }
}