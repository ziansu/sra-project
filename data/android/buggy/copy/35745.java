public void setConfigJson(java.lang.String configJson) {
    this.mConfigJson = configJson;
    try {
        mMenus.clear();
        parseJson();
        m1LevelMenuAdapter.notifyDataSetChanged();
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}