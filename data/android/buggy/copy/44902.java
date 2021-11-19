@java.lang.Override
public org.apache.cloudstack.api.response.ResourceTagResponse createResourceTagResponse(com.cloud.server.ResourceTag resourceTag, boolean keyValueOnly) {
    com.cloud.api.query.vo.ResourceTagJoinVO rto = com.cloud.api.ApiDBUtils.newResourceTagView(resourceTag);
    return com.cloud.api.ApiDBUtils.newResourceTagResponse(rto, keyValueOnly);
}