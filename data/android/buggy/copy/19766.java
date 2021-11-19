@Test
public void addBlock() throws java.lang.Exception {
    java.lang.String hash_to_test = "00000000126748912643A126482:TEST";
    java.lang.String data_to_test = "{\"prev_hash\": \"00000000126748912643A1_PREV:TEST\", \"description\": \"Furkan\'\'IN kol geni\", \"nonce\": 123}";
    db.addBlock(hash_to_test, data_to_test);
    java.lang.String result = db.getData(hash_to_test);
    java.lang.String data_expected = "{\"prev_hash\": \"00000000126748912643A1_PREV:TEST\", \"description\": \"Furkan\'IN kol geni\", \"nonce\": 123}";
    assertEquals(data_expected, result);
}