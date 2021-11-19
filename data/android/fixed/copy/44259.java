@java.lang.Override
public co.cask.cdap.api.data.schema.Schema read(com.google.gson.stream.JsonReader reader) throws java.io.IOException {
    return read(reader, new java.util.HashMap<java.lang.String, co.cask.cdap.api.data.schema.Schema>());
}