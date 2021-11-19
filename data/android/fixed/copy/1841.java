@java.lang.Override
public void println(final java.lang.String str) {
    realPrintStream.println(str);
    newOutputStream.println(str);
}