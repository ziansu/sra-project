@org.junit.Test
public void testGetObject_int() {
    list.addObject("obj", frank_json.JSON.createNewJSONObject().add("bla", "bla"));
    assertEquals("bla", list.getObject(0).get("bla"));
}