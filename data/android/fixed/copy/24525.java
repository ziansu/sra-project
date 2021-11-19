private static java.lang.String ensureRegex(final java.lang.String string, final boolean isRegex) {
    if (isRegex) {
        return string;
    }else {
        return com.puppycrawl.tools.checkstyle.checks.imports.PkgControl.toRegex(string);
    }
}