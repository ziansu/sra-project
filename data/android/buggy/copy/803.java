public static java.lang.String getExtension(java.nio.file.Path path) {
    java.lang.String extensionPlain = at.zierler.privat.lianosrenamer.helpers.PathHelper.getExtensionPlain(path);
    return (extensionPlain == null) || (extensionPlain.equals("")) ? extensionPlain : "." + extensionPlain;
}