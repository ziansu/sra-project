@java.lang.Override
public void writeRecord(com.rtg.ngs.tempstage.BinaryTempFileRecord rec) throws java.io.IOException {
    rec.writeNio(mBuffer);
    mBuffer.flip();
    mOutChannel.write(mBuffer);
    mBuffer.clear();
}