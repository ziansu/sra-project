public static void toStream(@javax.annotation.Nonnull
final java.lang.Object obj, @javax.annotation.Nonnull
final java.io.OutputStream out) throws java.io.IOException {
    java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(out);
    oos.writeObject(obj);
    oos.flush();
    oos.close();
}