@java.lang.Override
public void consume(int lineIdx, @javax.annotation.Nullable
byte[] hash) {
    if (lineIdx > 0) {
        result.append("\n");
    }
    result.append((hash != null ? org.apache.commons.codec.binary.Hex.encodeHexString(hash) : ""));
}