@java.lang.Override
public void run() {
    while (true) {
        writeNextChunk();
        try {
            java.lang.Thread.sleep(delayInMilliseconds);
        } catch (java.lang.InterruptedException ex) {
            project.latex.balloon.writer.ChunkedSerialDataWriter.logger.error(ex.getMessage(), ex);
        }
    } 
}