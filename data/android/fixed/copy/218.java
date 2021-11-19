private com.backend.PicStatus getFileStatus(java.lang.String value) {
    if ("true".equalsIgnoreCase(value)) {
        return com.backend.PicStatus.HIDDEN;
    }
    if ("false".equalsIgnoreCase(value)) {
        return com.backend.PicStatus.EXIST;
    }
    return com.backend.PicStatus.valueOf(value);
}