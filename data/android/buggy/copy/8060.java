public int getEvent() {
    try {
        mEvent = mJSONObject.getInt(JsonCommadConstant.INTDATA);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return mEvent;
}