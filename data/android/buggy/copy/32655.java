@java.lang.Override
public void prepare() throws java.io.IOException {
    super.prepare();
    if ((getTotalSize()) > 0) {
        executorService.execute(new info.novatec.inspectit.storage.nio.stream.SocketExtendedByteBufferInputStream.SocketReadRunnable());
    }
}