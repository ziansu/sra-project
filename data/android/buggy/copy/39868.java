public static java.util.List<java.lang.String> readLines(java.lang.String classpathOrFilePath) {
    return kr.jm.utils.helper.JMFileIO.readLines(kr.jm.utils.helper.JMFileIO.getFile(classpathOrFilePath));
}