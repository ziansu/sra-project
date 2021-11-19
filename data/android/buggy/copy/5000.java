@java.lang.Override
public void forceOutput() {
    try {
        fileChannel.force(false);
    } catch (final java.io.IOException ioe) {
        if (jcl.streams.FileStreamStruct.LOGGER.isWarnEnabled()) {
            jcl.streams.FileStreamStruct.LOGGER.warn("Could not force stream output.", ioe);
        }
    }
}