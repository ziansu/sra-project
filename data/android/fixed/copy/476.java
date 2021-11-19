void assignToNew(java.lang.String filename, simpledb.buffer.PageFormatter fmtr) {
    flush();
    fmtr.format(contents);
    blk = contents.append(filename);
    pins = 0;
}