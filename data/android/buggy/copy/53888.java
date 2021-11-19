@java.lang.Override
public boolean test(org.json.JSONObject jsonObject) {
    java.lang.Long rtime = jsonObject.getLong("rtime");
    return predicate.test(rtime);
}