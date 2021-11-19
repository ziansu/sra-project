@java.lang.Override
public void onComplete(com.vk.sdk.api.VKResponse response) {
    super.onComplete(response);
    try {
        setMessageInfo(response);
        listAdapter.notifyDataSetChanged();
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}