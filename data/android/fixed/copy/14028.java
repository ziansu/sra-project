public static java.lang.String readFile(java.lang.String path, java.lang.String charset) throws java.io.IOException {
    return util.Util.readFile(new java.io.File(path), charset);
}