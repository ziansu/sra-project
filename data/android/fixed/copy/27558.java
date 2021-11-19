@java.lang.Override
public javax.json.JsonObjectBuilder toJson() {
    return super.toJson().add("id", md.getId()).add("outputType", "SCALAR");
}