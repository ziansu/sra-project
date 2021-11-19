public static java.io.FileWriter writeFile(java.lang.String file) {
    return com.shenit.commons.utils.IOStreamUtils.writeFile(com.shenit.commons.utils.IOStreamUtils.checkFileExists(file));
}