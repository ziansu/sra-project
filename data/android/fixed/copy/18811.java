@java.lang.Override
public void run() {
    if (!(timeoutCancelled)) {
        speechRecognizer.stopListening();
        if ((hotwordDetector) != null) {
            hotwordDetector.startListening();
        }
    }
}