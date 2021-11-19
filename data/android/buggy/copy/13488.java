static com.stnetix.ariaddna.externalcloudapi.implementation.Request deleteRequest(com.stnetix.ariaddna.externalcloudapi.implementation.HttpUrl url, java.lang.String token) {
    return com.stnetix.ariaddna.externalcloudapi.implementation.YandexDiskHelper.baseRequest.newBuilder().header("Authorization", ("OAuth " + token)).delete().tag(null).build();
}