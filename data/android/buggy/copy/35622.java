@java.lang.Override
public void write(int b) throws java.io.IOException {
    out.write(b);
    flush();
}