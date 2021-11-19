private void parseResult(org.json.JSONArray response) {
    feedItemList = com.locol.locol.Parser.parseJSONResponse(response);
    android.util.Log.wtf(com.locol.locol.FeedFragment.TAG, feedItemList.toString());
}