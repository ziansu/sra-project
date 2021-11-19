protected com.abiquo.api.exceptions.APIException translateException(final java.lang.Exception e) {
    return new com.abiquo.api.exceptions.ConflictException(com.abiquo.api.exceptions.APIError.NODECOLLECTOR_ERROR);
}