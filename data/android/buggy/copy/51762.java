public void addResourceTypes(java.util.List<java.net.URI> types) throws info.rmapproject.webapp.exception.RMapWebException {
    if (types != null) {
        for (java.net.URI type : types) {
            addResourceType(type.toString());
        }
    }else {
        throw new info.rmapproject.webapp.exception.RMapWebException(info.rmapproject.webapp.exception.ErrorCode.ER_RESOURCE_TYPE_NULL);
    }
}