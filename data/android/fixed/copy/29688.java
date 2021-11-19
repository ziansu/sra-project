@java.lang.Override
@javax.annotation.WillClose
public void close() {
    synchronized(sync) {
        if (!(writerClosed)) {
            try {
                writerClosed = true;
                flush();
            } finally {
                bufferProvider.recycle(buffer);
            }
        }
    }
}