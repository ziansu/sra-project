public com.mnt.base.util.IndexableString trimStart() {
    if (((length()) > 0) && ((currentChar()) < (com.mnt.base.util.IndexableString.TRIMABLE_CHAR))) {
        (indexNum)++;
        trimStart();
    }
    return this;
}