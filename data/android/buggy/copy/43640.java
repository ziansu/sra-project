public org.apache.atlas.repository.graphdb.AtlasEdge getEdgeForGUID(java.lang.String guid) throws org.apache.atlas.exception.AtlasBaseException {
    org.apache.atlas.repository.graphdb.AtlasEdge ret = null;
    try {
        ret = findEdge(Constants.GUID_PROPERTY_KEY, guid);
    } catch (org.apache.atlas.typesystem.exception.EntityNotFoundException e) {
        new org.apache.atlas.exception.AtlasBaseException(org.apache.atlas.AtlasErrorCode.RELATIONSHIP_GUID_NOT_FOUND, guid);
    }
    return ret;
}