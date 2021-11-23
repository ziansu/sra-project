public void sendToClient(org.json.JSONObject response) {
    out.println(response.toString());
    out.flush();
    java.lang.System.out.println(("Response to client: " + response));
}