public org.vgdev.packagepanic.Mail readFromJSON(org.json.JSONObject json) {
    x = json.optInt("x", 0);
    y = json.optInt("y", 0);
    return this;
}