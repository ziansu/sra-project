public static <T> com.github.wnameless.jsonapi.ResourcesDocument<T> resourcesDocument(T[] attrAry, java.lang.String type) {
    return com.github.wnameless.jsonapi.JsonApi.resourcesDocument(java.util.Arrays.asList(attrAry), type);
}