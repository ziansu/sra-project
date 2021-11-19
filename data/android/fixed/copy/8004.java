private void checkCRC32() {
    int newCRC = ((int) ((lznp.util.FileIO.getCRC32(outStream)) & -1));
    if ((origCRC32) != newCRC)
        throw new lznp.exception.InvalidChecksumException("Error in decompressing file or corrupted file.");
    
}