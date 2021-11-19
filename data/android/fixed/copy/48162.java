@java.lang.Override
public void run() {
    try {
        downloadDelayedTrains(trainName, url);
    } catch (java.lang.Exception e) {
        errorWriter.writeError(e.toString());
    }
}