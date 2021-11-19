@java.lang.Override
public java.lang.String toString() {
    return new com.google.gson.GsonBuilder().excludeFieldsWithoutExposeAnnotation().create().toJson(this);
}