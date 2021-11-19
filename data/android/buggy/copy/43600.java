void assignToBlock(simpledb.buffer.Block b) {
    flush();
    blk = b;
    contents.read(blk);
    pins = 0;
    readCount = 0;
    writeCount = 0;
}