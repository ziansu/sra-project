public com.google.gson.JsonObject get() throws java.io.IOException {
    return mGson.fromJson(mIn.readUTF(), com.google.gson.JsonObject.class);
}