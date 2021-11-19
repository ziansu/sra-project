public static java.io.IOException forIO(java.lang.String format, java.lang.Object... args) {
    return new java.io.IOException(pw.phylame.ycl.util.Exceptions.fmt(format, args));
}