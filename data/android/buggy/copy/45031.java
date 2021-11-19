@java.lang.Override
public int read() {
    return (readByte()) & 255;
}