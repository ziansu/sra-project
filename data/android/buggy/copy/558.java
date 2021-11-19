@org.junit.Test(expected = org.graylog2.plugin.alarms.callbacks.AlarmCallbackException.class)
public void graylogBaseUrlRetrievalInvalidUri() throws org.graylog2.plugin.alarms.callbacks.AlarmCallbackException {
    org.graylog2.alarmcallbacks.hipchat.HipChatAlarmCallback.getGraylogBaseUrl(new org.graylog2.plugin.configuration.Configuration(com.google.common.collect.ImmutableMap.<java.lang.String, java.lang.Object>of("api_token", "TEST_api_token", "room", "TEST_room", "color", "INVALID", "graylog_base_url", "invalid URI")));
}