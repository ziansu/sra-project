@java.lang.Override
public final void write(byte[] b) throws java.io.IOException {
    if (!(isOpened))
        throw new java.io.IOException("This port appears to have been shutdown or disconnected.");
    
    write(b, 0, b.length);
}