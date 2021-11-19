@org.junit.Test
public void toStringReturnsJSONArray() {
    csd4464.a2.Course c = new csd4464.a2.Course(defaultStudentList);
    org.json.simple.JSONArray expectedJSON = new org.json.simple.JSONArray();
    expectedJSON.addAll(defaultStudentList);
    assertEquals(c.toString(), expectedJSON.toString());
}