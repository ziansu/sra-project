@java.lang.Override
public boolean fromJSON(org.json.JSONObject obj) {
    boolean res = super.fromJSON(obj);
    res = res && (setAdmin(getCreatedBy()));
    return res;
}