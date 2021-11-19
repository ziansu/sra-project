@java.lang.Override
public void write(int b) throws java.io.IOException {
    if ((written) == (lineWidth)) {
        out.write(eolBytes);
    }
    out.write(b);
    (written)++;
}