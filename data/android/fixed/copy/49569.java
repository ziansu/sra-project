public void friendsCallback(java.lang.Object res) throws org.json.JSONException {
    org.json.JSONArray response = ((org.json.JSONArray) (res));
    friends = response.getJSONArray(1);
    java.lang.System.out.println(friends);
    adapter.notifyDataSetChanged();
}