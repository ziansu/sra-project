@java.lang.Override
public java.util.concurrent.Future<com.google.gson.JsonObject> call(java.lang.String method, com.google.gson.JsonArray args) {
    return requestExecutor.submit(responseMap.get(method));
}