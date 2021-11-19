@javax.websocket.OnClose
public void onClose(javax.websocket.Session session) throws java.io.IOException, javax.websocket.EncodeException, org.json.JSONException {
    org.websocket.test.endpoint.TestUpdateEndPoint.sessions.remove(session);
    java.lang.String userId = ((java.lang.String) (session.getUserProperties().get("userId")));
    sendDisconnection(userId);
}