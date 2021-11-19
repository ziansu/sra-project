@java.lang.Override
public void syncWriter() throws java.io.IOException {
    synchronized(writerLock) {
        if ((writer) != null)
            writer.flush();
        
        writer.sync();
    }
}