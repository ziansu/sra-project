@org.junit.Test
public void testGetObject_int() {
    object.addObject("obj", frank_json.JSON.createNewJSONObject().add("bla", "bla"));
    assertEquals("bla", object.getObject(0).get("bla"));
}