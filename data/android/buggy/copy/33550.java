public void setHometown(org.json.JSONObject obj) {
    try {
        this.hometown = obj.getString("hometown");
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}