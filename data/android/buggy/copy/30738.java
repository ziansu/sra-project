public static boolean validatePath(java.lang.String path) {
    if ((path == null) || (path.isEmpty())) {
        return false;
    }
    return by.bsu.contactdirectory.util.validator.AttachmentValidator.pathPattern.matcher(path).matches();
}