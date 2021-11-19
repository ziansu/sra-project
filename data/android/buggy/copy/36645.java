public void insertBytes(byte[] space, int pos) throws java.io.IOException {
    int offset = pos * 4096;
    file.seek(pos);
    file.write(space, offset, FileProcessor.BLOCK_SIZE);
}