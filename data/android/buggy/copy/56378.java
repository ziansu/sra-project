public static void toStream(@javax.annotation.Nonnull
final java.io.Externalizable obj, @javax.annotation.Nonnull
final java.io.OutputStream out) throws java.io.IOException {
    java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(out);
    obj.writeExternal(oos);
    oos.flush();
    oos.close();
}