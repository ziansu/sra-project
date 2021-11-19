public static org.wso2.carbon.apimgt.rest.api.util.exception.ConflictException buildConflictException(java.lang.String description) {
    org.wso2.carbon.apimgt.rest.api.util.dto.ErrorDTO errorDTO = org.wso2.carbon.apimgt.rest.api.util.utils.RestApiUtil.getErrorDTO(RestApiConstants.STATUS_CONFLCIT_MESSAGE_DEFAULT, 409L, description);
    return new org.wso2.carbon.apimgt.rest.api.util.exception.ConflictException(errorDTO);
}