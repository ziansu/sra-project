@org.junit.Test
public void getsAFakeJSONResponse() {
    pkmncore.SearchFake fake = new pkmncore.SearchFake();
    com.google.gson.JsonObject response = fake.findByName("pikachu");
    org.junit.Assert.assertEquals("pikachu", response.get("name").getAsString());
}