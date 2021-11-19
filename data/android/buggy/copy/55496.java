@java.lang.SuppressWarnings(value = "unsignedness")
public static void getUnsigned(java.nio.ByteBuffer b, @org.checkerframework.checker.unsignedness.Unsigned
byte[] bs) {
    byte[] temp = ((byte[]) (bs));
    b.get(temp);
}