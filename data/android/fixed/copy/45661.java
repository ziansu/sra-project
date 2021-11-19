public static android.support.v4.provider.DocumentFile getDirDocument(android.content.Context context, java.lang.String rootPath, java.lang.String... subDirs) {
    return ml.puredark.hviewer.utils.DocumentUtil.getDirDocument(context, android.net.Uri.parse(rootPath), subDirs);
}