@java.lang.Override
public java.io.DataInputStream load(java.lang.String dummy) throws jd.core.loader.LoaderException {
    java.lang.System.out.println(dummy);
    return new java.io.DataInputStream(new java.io.ByteArrayInputStream(bytecode));
}