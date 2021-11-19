@java.lang.Override
public long getLength() throws java.io.IOException, java.lang.InterruptedException {
    return (wrappedInputSplit) != null ? wrappedInputSplit.getLength() : 0;
}