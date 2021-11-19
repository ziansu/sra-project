public void write(java.io.DataOutput out) throws java.io.IOException {
    out.writeUTF(description);
    out.writeInt(dimensions.length);
    for (int cInt : dimensions) {
        out.writeInt(cInt);
    }
}