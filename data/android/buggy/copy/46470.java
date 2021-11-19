@java.lang.Override
public void close() throws java.io.IOException {
    _state = com.fasterxml.jackson.dataformat.protobuf.ProtobufParser.STATE_CLOSED;
    _currToken = null;
    if (!(_closed)) {
        _closed = true;
        try {
            _closeInput();
        } finally {
            _releaseBuffers();
        }
    }
}