@java.lang.Override
public void onResponse(me.joshuamarquez.sails.io.JWR response) {
    assertEquals(java.lang.Integer.parseInt(response.getBody().toString()), 2);
    values.offer("done");
}