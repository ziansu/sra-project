public static java.lang.String getProjectPath() {
    return edu.iastate.hungnv.babelref.core.Helper.getActiveEditorFile().getProject().getLocation().toOSString().replace("/", "\\");
}