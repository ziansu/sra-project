public static void writeStringToFile(final java.lang.String string, final java.lang.String pFilePath) throws java.io.IOException {
    com.github.sumimakito.maglevio.MaglevWriter.NIO.MappedBFR.writeBytesToFile(string.getBytes(), pFilePath);
}