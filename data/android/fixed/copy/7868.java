@java.lang.Override
public org.json.JSONObject getNextData() throws java.lang.Exception {
    return events.poll();
}