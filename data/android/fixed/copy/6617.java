@java.lang.Override
public void write(int b) throws java.io.IOException {
    write(new byte[]{ ((byte) (b)) }, 0, 1);
}