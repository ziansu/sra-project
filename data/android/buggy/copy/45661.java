public static android.support.v4.provider.DocumentFile getDirDocument(android.content.Context context, java.lang.String rootPath, java.lang.String... subDirs) {
    android.support.v4.provider.DocumentFile root = android.support.v4.provider.DocumentFile.fromTreeUri(context, android.net.Uri.parse(rootPath));
    return ml.puredark.hviewer.utils.DocumentUtil.getDirDocument(root, subDirs);
}