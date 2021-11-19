@java.lang.Override
public void close() throws java.io.IOException {
    try {
        flush();
    } finally {
        org.msgpack.core.MessagePacker messagePacker = getMessagePacker();
        messagePacker.close();
    }
}