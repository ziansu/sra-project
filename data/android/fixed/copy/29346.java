private void writeDESData(final byte[] desData) throws java.io.IOException {
    if (desData != null) {
        mOutputFile.write(desData);
    }
}