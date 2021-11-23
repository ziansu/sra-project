public void setYear(org.json.JSONObject obj) {
    try {
        this.year = obj.getInt("year");
    } catch (org.json.JSONException e) {
    }
}