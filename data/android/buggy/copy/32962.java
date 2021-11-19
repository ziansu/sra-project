public static java.lang.String getFileDelimiter(boolean escaped) {
    if (escaped) {
        return "\\" + (com.spectralogic.ds3cli.util.SterilizeString.fs);
    }
    return com.spectralogic.ds3cli.util.SterilizeString.fs;
}