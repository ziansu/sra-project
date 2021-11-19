public void writeExternal(java.io.ObjectOutput out) throws java.io.IOException {
    out.write(length, 0, length.length);
    out.write(type);
    out.write(payload, 0, payload.length);
}