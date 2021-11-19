@ome.annotations.RolesAllowed(value = "user")
public byte[] getThumbnailByLongestSideDirect(java.lang.Integer size) {
    errorIfNullPixelsAndRenderingDef();
    byte[] value = _getThumbnailByLongestSideDirect(size, null, null, true);
    iQuery.clear();
    return value;
}