@java.lang.Override
public void onComplete(org.json.JSONObject response) {
    response2SearchPlaces(response, keyword, locale, listener);
}